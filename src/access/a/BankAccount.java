package access.a;

public class BankAccount {
    private int balance;

    /**
     * 계좌 생성자, 초기 계좌 잔고는 0으로 설정
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * 계좌 잔액 확인 메서드
     * getter를 통해 정보 획득
     * @return balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * 입금
     * @param amount 입금 금액
     */
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    /**
     * 출금
     * @param amount 출금 금액
     */
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    /**
     * private 메서드
     * 출금, 혹은 입금 시 이상한 정보가 아닌지 판별
     * 금액이 0 이상이아야 한다.
     * @param amount 출금 혹은 입금 정보
     * @return 정상이면 true 반환
     */
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야한다.
        return amount > 0;
    }
}
