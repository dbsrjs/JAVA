package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
/*
 - 실행 결과를 보면 상수들이 열거형으로 선언한 타입이 Grade 타입을 사용하는 것을 확인할 수 있다.
 - 그리고 각각의 인스턴스도 서로 다른 것을 확인할 수 있다.
 - 참고로 열거형은 toString()를 오버라이딩 하기 때문에 참조값을 직접 확인할 수 없다.
 - 참조값을 확인하기 위해 refValue()를 생성한다.
  - System.identityHashCode(grade) : 자바가 관리하는 객체의 참조값을 숫자로 반환한다.
  - Integer.toHexString() : 숫자를 16진수로 변환, 우리가 일반적으로 확인하는 참조값(16진수)
 - 열거형도 클래스이다. 열거형을 제공하기 위해 제약이 추가된 클래스라 생각하면 편하다.
 */
