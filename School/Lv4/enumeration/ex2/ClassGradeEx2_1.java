package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DisCountService disCountService = new DisCountService();
        int basic = disCountService.disCount(ClassGrade.BASIC, price);
        int gold = disCountService.disCount(ClassGrade.GOLD, price);
        int diamond = disCountService.disCount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
