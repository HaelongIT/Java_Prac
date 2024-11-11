package poly.ex.pay0;

public class PayService {
    Pay pay;

    public void setPay(String payOption) {
        if (payOption.equals("kakao")) {
            pay = new KaKaoPay();
        }
        else if (payOption.equals("naver")) {
            pay = new NaverPay();
        }
        else {
            System.out.println("결제 수단이 없습니다.");
        }
    }

    public void printResult(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    public void processPay(String payOption, int amount) {
        boolean result;

        System.out.println("결제를 시작합니다 : option = " +
                payOption + ", amount = " + amount);

        setPay(payOption);
        if (pay == null) {
            result = false;
        }

        result = pay.pay();

        printResult(result);
    }
}
