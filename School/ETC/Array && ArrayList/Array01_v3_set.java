package arraylist.ArrayList01;

import java.util.ArrayList;

public class Array01_v3_set {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("------------------------------");
		System.out.println("* ArrayList 저장된 내용");
		System.out.println("------------------------------");
		
		System.out.print("ArrayList: ");
		for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("");
        
        //수정 list.set(위치(index), 내용)
        list.set(0, "하나");
        list.set(1, "둘");
        list.set(2, "셋");
        list.set(3, "넷");
        System.out.println("");
        System.out.print("Arraylist: ");
        for(String s : list) {
        	System.out.print(s+" ");
        }
        System.out.println("");
        //System.out.println("ArrayList 삭제 후: " + list);
	}
}
