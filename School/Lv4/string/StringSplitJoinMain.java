package lang.string;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split() //문자열 나누기
        String[] splitstr = str.split(",");

        for(String s : splitstr) {
            System.out.println(s);
        }

        //Join
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 : " + joinedStr);

        //문자열 배열 연결
        String result = String.join("-", splitstr);
        System.out.println("result : " + result);
    }
}
