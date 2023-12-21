package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        // 주소가 없기 때문에 에러 발생
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
