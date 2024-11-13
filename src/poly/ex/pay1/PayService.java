package poly.ex.pay1;

public class PayService {
    boolean result;
    private PayFactory payFactory;

    // 생성자를 통한 의존성 주입
    public PayService() {
        this.payFactory = new PayFactory();
    }

    public void processPay(String payOption, int amount) {
        System.out.println("결제를 시작합니다 : option = " +
                payOption + ", amount = " + amount);

        // 생성자 주입(Pay의 자식 클래스에 대해서)
        // 서버(PayFactory)에 요청
        Pay selectPay = payFactory.setPay(payOption);

        // 서버(Pay의 자식 클래스)에 요청
        result = selectPay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
