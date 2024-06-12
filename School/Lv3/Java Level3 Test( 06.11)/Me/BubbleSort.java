package poly.sort;

public class BubbleSort implements Sort{
    private String name = "BubbleSort";
    @Override
    public void ascending(int[] nums) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println(name+"입니다.");
    }
}
