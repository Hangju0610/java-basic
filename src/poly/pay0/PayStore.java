package poly.pay0;

public abstract class PayStore {
    public static Pay setPay(String option) {
        // 결제 수단 추가시 변하는 부분
        return switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "toss" -> new TossPay();
            default -> new DefaultPay();
        };
    }
}
