package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // 입력 금액 검증(내부기능)
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    // 입금(외부기능)
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        }
        else {
            System.out.println("유효하지 않음 금액");
        }
    }

    // 출금(외부기능)
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        }
        else {
            System.out.println("금액이 유효하지 않거나 잔액이 부족함");
        }
    }

    // 계좌 잔액확인(외부기능)
    public int getBalance() {
        return balance;
    }
}
