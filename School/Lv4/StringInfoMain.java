package lang.string;

public class StringInfoMain {
    //문자열 정보 조회
    public static void main(String[] args) {
        String str = "Hello, java!";

        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열이 비어 있는지 : " + str.isEmpty());//안 비어있기 때문에 경고
        System.out.println("문자열이 비어 있거나 공백인지 : " + str.isBlank());//java 11 이상

        char c = str.charAt(7); //공백 포함
        System.out.println("7번 인덱스의 문자 : " + c);
    }
}
