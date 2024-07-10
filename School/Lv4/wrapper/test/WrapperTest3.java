package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //String str을 Integer로 변환해서 출력 : 박싱
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

        //Integer를 int로 변환해서 출력 : 오토 언박싱
        int intValue = integer1;
        System.out.println(intValue);

        //int를 Integer로 변환해서 출력 : 오토 박싱
        Integer integer2 = intValue;
        System.out.println(integer2);
    }
}
