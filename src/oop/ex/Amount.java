package oop.ex;

public class Amount {
    int balance;        // 잔액

    // 생성자
//    public Amount() {
//        this.balance = 0;
//    }
    // 굳이 생성자로 0을 고정적으로 초기화 하지 않아도 balance는 필드라서 자동으로 항상 0으로 초기화되므로 노필요

    // 기능 : deposit(입금), withdraw(출금)
    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("잔액 부족");
            System.out.println("잔고 : " + balance);
        }
    }
}
