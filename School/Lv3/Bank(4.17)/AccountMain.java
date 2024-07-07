package Bank;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        //1) 계좌에 10000 원 입금
        //2) 계좌에서 9000원 출금
        //3) 계좌에서 2000원을 출금 -> 잔액 부족 출력
        //4) 잔고를 출력

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}

///실행결과
//잔액 부족
//잔고: 1000
