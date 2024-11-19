package arraylist.ArrayList01;

import java.util.ArrayList;

public class Array01_v4_get {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("--------------------");
		System.out.println("* ArrayList 저장된 내용");
		System.out.println("--------------------");
		
		System.out.print("Arraylist: ");
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		
		System.out.print(list.subList(1, 3));
	}
}
