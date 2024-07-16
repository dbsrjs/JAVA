package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            //name : 이름, ordinal : index 번호
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        //String -> Enum
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);//toString() 오버라이딩 가능

        /*
        1. Arrays.toString() : 배열의 참조값이 아니라 배열 냅의 값을 출력할 때 사용
        2. values() : 모든 ENUM 상수를 포함하는 배열을 반환한다.
        3. name() : ENUM 상수의 이름을 문자열로 반환한다.
        4. ordinal() : ENUM 상수의 선언 순서(0부터 시작)를 반환한다.
        5. toString() : ENUM 상수의 이름을 문자열로 반환한다. name() 메서드와 유사하지만, toString()은
            직접 오버라이딩 할 수 있다.

        ---!주의!---
         ordinal()은 가급적 사용하지 않는 것이 좋다.
            BASIC와 GOLD 사이에 상수를 추가하면 GOLD의 index 번호가 밀리기 때문.
        ---!주의!---
         */
    }
}
/*
모든 열거형은 java.lang.Enum 클래스를 자동으로 상속받는다.
따라서 해당 클래스가 제공하는 기능들을 사용할 수 있다.
 */
