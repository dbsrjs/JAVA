package poly.basic;

public class castingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;    //업케스팅
        Parent parent2 = child; //업케스티은 생략이 가능함.

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
