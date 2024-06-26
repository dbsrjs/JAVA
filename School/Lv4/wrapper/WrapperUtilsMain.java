package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");//문자열 전용, 기본형 전환

        //비교
        int comparResult = i1.compareTo(20);
        System.out.println("comparResult = " + comparResult);

        //산술 연산
        System.out.println("sum : " + Integer.sum(10, 20));//합
        System.out.println("min : " + Integer.min(10, 20));//최소값
        System.out.println("max : " + Integer.max(10, 20));//최대값
    }
}
/*
vakueOf() : 래퍼 타입을 반환한다. 숫자, 문자열 모두 지원한다.
parseInt() : 문자열을 기본형으로 변환한다.
comparTo() : 내 값과 인수로 넘어온 값을 비교한다, 내 값이 크면 1, 같으면 0, 작으면 -1을 반환한다.
Integer.sum(), min(), max() : static 메서드이다. 간단한 덧셈, 작은 값, 큰 값 연산을 수행한다.
 */
