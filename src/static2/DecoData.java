package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수 접근, 컴파일러 에러
//        instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러

        staticValue++; // 정적 변수 접근
        staticMethod(); //
    }

    // 객체의 참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스의 변수나 메서드를 호출할 수 있다.
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근, 컴파일러 에러
        instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue= " + staticValue);
    }
}
