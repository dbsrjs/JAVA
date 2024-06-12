package poly.sort;

public interface Sort {
    void ascending(int[] nums);   //오름차순 정렬
    void descending(int[] nums);  //내림차순 정렬
    default void description()    //알고리즘에 대한 설명
    {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
        // default : 재정의할 필요 없이 그냥 가져다 쓸 수 있음.
		    // 대신 바디를 구현해야한다.
    }
}
