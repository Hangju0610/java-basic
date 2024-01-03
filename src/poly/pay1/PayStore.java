package poly.pay1;

import poly.pay0.DefaultPay;
import poly.pay0.KakaoPay;
import poly.pay0.NaverPay;
import poly.pay0.Pay;
import poly.pay0.TossPay;

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
