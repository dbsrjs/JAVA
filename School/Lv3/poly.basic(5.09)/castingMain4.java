package poly.basic;

public class castingMain4 {
    //다운케스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다.
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}
