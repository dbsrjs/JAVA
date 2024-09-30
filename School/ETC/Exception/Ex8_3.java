package jch08;

public class Ex8_3 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않음
        } catch (Exception e) { // ArithmeticException 대신 Exception을 사용함
            System.out.println(5);
        } // try-catch문의 끝
        
        /* 어짜피 위에 모든 오류의 부모인 Exception 클래스가 있기 때문에 아래에 다른 오류는 필요가 없음.
         * catch (ArithmeticException ae) { System.out.println("ae"); }
         */
        
        System.out.println(6);
        // main 메서드의 끝
    }
}