package arraylist.ArrayList01;

import java.util.ArrayList;

public class Array01_v11_add_index {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("-----------------------------------------");
		System.out.println("* ArrayList 저장된 내용");
		System.out.println("-----------------------------------------");
		
		System.out.print("ArrayList : ");
		for(String s : list) {//데이터 하나씩 출력
			System.out.print(s + " ");
		}
		System.out.println("");
		System.out.println("ArrayList size : " + list.size());
		//System.out.println(list);//ArrayList 전체 출력
		
		//삽입할 위치(index) 설정 후 등록 list.add(위치, 내용);
		list.add(0, "하나");	//add(위치(index), 내용)
		list.add(1, "둘");	//add(위치(index), 내용)
		list.add(2, "셋");	//add(위치(index), 내용)
		list.add(3, "넷");	//add(위치(index), 내용)
		System.out.println("");
		System.out.print("ArrayList : ");
		for(String s : list) {//데이터 하나씩 출력
			System.out.print(s + " ");
		}
		
		System.out.println("");
		System.out.println("전체 출력 : " + list);//ArrayList 전체 출력
		
		System.out.println("ArrayList size : " + list.size());
	}
}
