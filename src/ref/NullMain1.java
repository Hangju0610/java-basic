package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 아직 가리키는 객체가 없다.
        System.out.println("1. data = " + data);
        data = new Data(); // 새로운 객체를 할당
        System.out.println("1. data = " + data);
        data = null; // Data 인스턴스를 더 이상 참조하지 않는다.
        System.out.println("1. data = " + data);
    }
}
