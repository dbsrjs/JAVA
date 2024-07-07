package poly.basic;

public class castingMain2 {
    public static void main(String[] args) {
        //다형적 참조
        Parent poly = new Child();

        //poly.childMethod();

        //일시적 다운케스팅(부모타입 -> 자식타입)
        ((Child)poly).childMethod();//메모리 절약 가능
    }
}
