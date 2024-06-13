package lang.Immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);//서울
        System.out.println("b = " + b);//부산

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);//부산
        System.out.println("b = " + b);//부산
    }
}
/*
참조형 변수들은 같은 참조값을 통해 같은 인스턴스를 참조할 수 있다.
b = a 라고 하면 a에 있는 참조값(주소값) x001을 복사해서 b에 전달한다.
 - 자바에서 모든 값 대입(=)은 가지고 있는 값을 복사해서 전달한다.
참조값을 복사해서 전달하므로 결과적으로 a, b는 같은 x001 인스턴스를 참조한다.
 */
