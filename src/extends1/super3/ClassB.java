package extends1.super3;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 100); // this 사용, 다른 Constructor로 접근
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a+" b="+b);
    }
}
