package poly.basic;

/**
 * 다형적 참조 : 부모는 자식을 품을 수 있다.
 */
public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모 타입에 자식 인스턴스 넣기
        poly.parentMethod(); // 부모 타입에 있는 메서드는 사용 가능
//        poly.childMethod(); // 자식의 기능은 호출할 수 없다. 컴파일 오류 발생

//        Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.
    }
}
