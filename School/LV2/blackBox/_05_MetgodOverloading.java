package blackBox;

public class _05_MetgodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false,false, 5);
        System.out.println(("---------------------------"));
        b1.record(true, false, 3);
        System.out.println(("---------------------------"));
        b1.record(true, true, 5);
        System.out.println(("---------------------------"));
        b1.record();

        System.out.println(10);
    }
}
