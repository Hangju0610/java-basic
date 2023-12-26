package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지여서 defaultField 호출 불가
//        data.defaultField = 2; // 호출 불가
//        data.defaultMethod(); // 호출 불가

        //private 호출 불가
//        data.privateField = 3; // 접근 불가
//        data.privateMethod(); // 접근 불가
        data.innerAccess();
    }
}
