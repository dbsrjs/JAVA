package Bank;

public class Account {
    int balance; //잔액

    void deposit(int amount) {  //입금 메서드
        //입금시 잔액이 증가함.
        balance += amount;
    }

    void withdraw(int amount) {//출금 메서드
        //출금시 잔액이 감소함.
        //만약 잔액이 부족하면 잔액 부족을 출력함
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }
}
