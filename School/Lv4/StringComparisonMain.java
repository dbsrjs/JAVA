package lang.string;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2 : " + str1.equals(str2));  //false
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));//true, 대소문자 구분 없이
        System.out.println("'b' compareTo 'a' : " + "d".compareTo("a"));//3
        System.out.println("str1 compareTo str2 : " + str1.compareTo(str2));//-32
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2));//0
        System.out.println("str1 strarts with 'hello' : " + str1.startsWith("Hello"));//true
        System.out.println("str1 ends widh 'Java!' : " + str1.endsWith("Java!"));//true
    }
}
