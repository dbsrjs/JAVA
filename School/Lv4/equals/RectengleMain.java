package lang.object.test;

public class RectengleMain {
    public static void main(String[] args) {
        Rectengle rect1 = new Rectengle(100, 20);
        Rectengle rect2 = new Rectengle(100, 20);

        System.out.println(rect1);
        System.out.println(rect2);

        System.out.println(rect1 == rect2);     //false
        System.out.println(rect1.equals(rect2));//true
    }
}
