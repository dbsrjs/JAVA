package poly.sort;

public class HeapSort implements Sort{
    private String name = "HeapSort";
    @Override
    public void ascending(int[] nums) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println(name +" descending");
    }

    @Override
    public void description() {
				Sort.super.description(); // default 메서드 사용
        System.out.println(name+"입니다.");
    }
}
