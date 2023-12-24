package oop1;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("잔고: " + balance);
    }
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        } else {
            balance -= amount;
            System.out.println("잔고: " + balance);
        }
    }
}
