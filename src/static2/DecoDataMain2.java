package static2;

//import static static2.DecoData.staticCall; // 특정 클래스 메서드 하나만 사용할 경우
import static static2.DecoData.*; // 특정 클래스 메서드를 전부 사용하고 싶은 경우
public class DecoDataMain2 {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

    }
}
