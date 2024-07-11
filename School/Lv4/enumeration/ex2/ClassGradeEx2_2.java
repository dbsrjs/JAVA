package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DisCountService disCountService = new DisCountService();

        ClassGrade newClassGrade = new ClassGrade();
        int result = disCountService.disCount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 급액 = " + result);
    }
}
