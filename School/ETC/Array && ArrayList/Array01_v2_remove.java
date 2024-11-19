package arraylist.ArrayList01;

import java.util.ArrayList;
import java.util.Arrays;

public class Array01_v2_remove {
	public static void main(String[] args) {
		String[] array = new String[10];
		ArrayList<String> list = new ArrayList<>();
		System.out.println("----------------------------------------");
		System.out.println("* Array와 ArrayList 크기");
		System.out.println("----------------------------------------");
		System.out.println("저장 전 array length : " + array.length);
		System.out.println(" 저장 전 ArrayList size : " + list.size());
		
		array[0] = "One";
		array[1] = "Two";
		array[2] = "Three";
		array[3] = "Four";
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("저장 후 array length : " + array.length);
		System.out.println("저장 후 ArrayList size : " + list.size());
		
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("* Array와 ArrayList 저장된 내용");
		System.out.println("----------------------------------------");
		System.out.print("Array  : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("ArrayList: " + list);
		
		
		System.out.println("----------------------------------------");
		System.out.println("* Array와 ArrayList 삭제");
		System.out.println("----------------------------------------");
		
		//삭제 명.remove[index]
		array[2] = "";
		list.remove(2);
		System.out.println("");
		System.out.println("Array 삭제 후 : "+Arrays.toString(array));
		System.out.println("ArrayList 삭제 후: " + list);
		
		//모든 데이터 삭제
		for (int i = 0; i < array.length; i++) {
			array[0] = "";			
		}
		list.clear();
		System.out.println("Array 전체 삭제 후: " + Arrays.toString(array));
		System.out.println("ArrayList 삭제 후: " + list);
	}
}
