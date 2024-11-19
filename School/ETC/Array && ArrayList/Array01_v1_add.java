package arraylist.ArrayList01;

import java.util.ArrayList;
import java.util.Arrays;

public class Array01_v1_add {
	public static void main(String[] args) {
		//타입 배열				크기
		String[] array = new String[10];//배열 자료형
		//리스트자료형 타입						크기(기본10)			
		ArrayList<String> list = new ArrayList<>(); //리스트 자료형<>제네릭(General 일반적)
		
		System.out.println("-----------------------------------");
		System.out.println("* Array와 ArrayList 크기");
		System.out.println("-----------------------------------");
		System.out.println("저장 전 array length : " + array.length);
		System.out.println("저장 전 ArrayList size : " + list.size());
		
		array[0] = "One";
		array[1] = "Two";
		array[2] = "Three";
		//인원 추가 시 인덱스 위치 설정 필수
		//array[3] = "Four";
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println("저장 후 array length : " + array.length);
		System.out.println("저장 후 ArrayList size : " + list.size());
		
		System.out.println("");
		System.out.println("-----------------------------------");
		System.out.println("* Array와 ArrayList 저장된 내용");
		System.out.println("-----------------------------------");
		System.out.print("Array   : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		//System.out.println(Arrays.toString(array));
		//java.util.Arrays.toString(); 메소드 사용
		System.out.print("ArrayList : ");
		for(String s : list) {//데이터 하나씩 출력
			System.out.print(s + " ");
		}
		System.out.println("");
		//System.out.println(list); //ArrayList 전체 출력
	}
}
