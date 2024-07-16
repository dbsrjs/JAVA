package enumeration.ref2;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DisCountService disCountService = new DisCountService();
        int basic = disCountService.discount(Grade.BASIC, price);

        System.out.println("basic = " + basic);
    }
}
