package poly.ex.pay1;

public class PayFactory {
    public Pay setPay(String payOption) {
        if (payOption.equals("kakao")) {
            return new KakaoPay();
        }
        else if (payOption.equals("naver")) {
            return new NaverPay();
        }
        else {
            return new DefaultPay();
        }
    }
}
