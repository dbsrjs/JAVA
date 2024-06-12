package poly.sort;

public class QuickSort implements Sort{
    private String name = "QuickSort";
    @Override
    public void ascending(int[] nums) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println(name+"입니다.");
    }
}
