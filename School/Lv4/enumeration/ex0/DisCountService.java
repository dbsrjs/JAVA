package enumeration.ex0;

public class DisCountService {
    public int disCount(String lv, int price) {
        int disCountPercent = 0;

        if(lv.equals("BASIC"))
            disCountPercent = 10;

        else if(lv.equals("GOLD"))
            disCountPercent = 20;

        else if(lv.equals("DIAMOND"))
            disCountPercent = 30;

        return price*disCountPercent / 100;
    }
}
/*
고객은 3등급으로 난누고, 상품 구매시 등그별로 할인을 적용한다 할인시 소수점 이하는 버린다.
1. BASIC : 10% 할인
2. GOLD : 20% 할인
3. DIAMOND : 30% 할인
회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스를 만들어보자.
예를 들어 GOLD, 10000을 입력하면 할인 대상 금액인 2000을 변환한다
 */
