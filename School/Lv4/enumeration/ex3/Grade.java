package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND
    //열거형을 정의할 때는 class 대신에 enum을 사용한다.
    //원하는 상수의 이름을 나열하면 된다.
    //enum 열거형도 클래스이다.
    //열거형은 자동으로 java.lang.Enum을 상속받는다.
}

/*
자바는 타입 안전 열거형 패턴을 매우 편리하게 사용할 수 있는 열겋8ㅇ(Enum Type)을 제공한다.
enum은 enumeration의 줄임말인데, 번역하면 열거라는 뜻이고, 어떤 항목을 나열한다는 뜻이다.
일련의 명명된 상수들의 집함을 청의하는 것을 의미하며, 프로그래밍에서는 이러한 상수들을 사용하여
코드 내에서 미리 정의된 값들의 집합을 나타낸다.
 - 쉽게 이야기해서 회원의 등급은 상수로 정의한 BASIC, GOLD, DIAMOND만 사용할 수 있다는 뜻이다.
 - 자바의 enum은 타입 안전성을 제공하고, 코드의 가독성을 높이며, 예상 가능한 값들의 집합을 표현하는데 사용한다.
 */

/*
아래 코드와 같은 코드이다.
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade() {}
}
*/
