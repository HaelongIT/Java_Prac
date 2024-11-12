package poly.ex.pay0;

public class PayService {

    public void processPay(String payOption, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다 : option = " +
                payOption + ", amount = " + amount);

        // 클라(서비스)-서버1(팩토리) 관계에서 요청1
        Pay pay = PayFactory.setPay(payOption);

        if (pay == null) {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        else {
            // 클라(서비스)-서버2(Pay) 관계에서 요청2
            result = pay.pay(amount);
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}