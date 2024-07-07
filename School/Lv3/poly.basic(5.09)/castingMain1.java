package poly.basic;

public class castingMain1 {
    public static void main(String[] args) {
        //다형적 참조
        Parent poly = new Child();

        //poly.childMethod();

        //다운케스팅(부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
