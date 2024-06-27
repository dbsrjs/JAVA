package poly.ex.pay1;

public abstract class PayStore {
    //결제 수단이 추가되거나 삭제되는 변경이 일어나면 수정하는 부분
    public static Pay findPay(String option) {
        if(option.equals("Kakao")) {
            return new KakaoPay();
        } else if(option.equals("Naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
