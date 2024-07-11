package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DisCountService disCountService = new DisCountService();
        int basic = disCountService.disCount(StringGrade.BASIC, price);
        int gold = disCountService.disCount(StringGrade.GOLD, price);
        int diamond = disCountService.disCount(StringGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
/*
문자열 상수를 사용한 덕분에 전체적으로 코드가 더 명화해졌다.
disCount()에 인자를 전달해도 StringGrade가 제공하는 문자열 상수를 사용하면 된다.
만약 실수로 상수의 이름을 잘 못 입력하면 컴파일 시점에 오류가 발생한다.
따라서 오류를 쉽고 빠르게 찾을 수 있다.
 */
