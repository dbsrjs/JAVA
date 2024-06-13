package lang.Immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);//서울
        System.out.println("b = " + b);//부산
            
        //b.setValue("부산");
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);//서울
        System.out.println("b = " + b);//부산
    }
}
