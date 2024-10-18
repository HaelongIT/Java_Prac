package oop.ex;

public class AmountMain {
    public static void main(String[] args) {
        Amount amount = new Amount();

        // 10000원 입금
        amount.deposit(10000);

        // 9000원 출금
        amount.withdraw(9000);

        // 2000원 출금 시도 -> 잔액 부족 출력 -> 남은 잔고 출력
        amount.withdraw(2000);
    }
}
