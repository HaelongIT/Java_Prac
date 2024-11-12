package poly.ex.pay0;

public class PayFactory {
    Pay pay;

    public static Pay setPay(String payOption) {
        if (payOption.equals("kakao")) {
            return new KaKaoPay();
        }
        else if (payOption.equals("naver")) {
            return new NaverPay();
        }
        else {
            return null;
        }
    }
}
