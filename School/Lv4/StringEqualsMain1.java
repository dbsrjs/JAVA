package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("== 비교 : " + (str1 == str2));          //false
        System.out.println("equals 비교 : " + (str1.equals(str2))); //true

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("== 비교 : " + (str3 == str4));          //true
        System.out.println("equals 비교 : " + (str3.equals(str4))); //true
    }
}