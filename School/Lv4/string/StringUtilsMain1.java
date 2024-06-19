package lang.string;

public class StringUtilsMain1 {
    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 : " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값 : " + objString);

        String numString2 = num + "";
        System.out.println("빈 문자열 + num : " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();

        for(char c : strCharArray)
            System.out.print(c);
    }
}
