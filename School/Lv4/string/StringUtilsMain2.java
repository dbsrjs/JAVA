package lang.string;

public class StringUtilsMain2 {
    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

       //format 메서드
        String format1 = String.format("num : %d, bool : %b str : %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자 : %.2f", 10.1234);//'.'다음에 숫자를 2개만 출력
        System.out.println(format2);

        //printf
        System.out.printf("숫자 : %.2f", 10.1234);
    }
}
