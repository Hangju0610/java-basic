package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        // 중복된 코드 제거
        // 두번째 생성자를 호출한다.
        this(name, age, 50); // 자기 자신의 생성사를 호출
    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age= "+ age + ", grade= "+ grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
