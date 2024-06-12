package lang.object;

public class objectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        System.out.println(child.toString());
    }
}
