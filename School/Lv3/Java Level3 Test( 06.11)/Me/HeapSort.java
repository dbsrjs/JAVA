@@ -0,0 +1,20 @@
package poly.sort;

public class HeapSort implements Sort{
    private String name = "HeapSort";
    @Override
    public void ascending(int[] nums) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] nums) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        System.out.println(name+"입니다.");
    }
}
