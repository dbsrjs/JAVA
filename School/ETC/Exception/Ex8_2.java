package jch08;

public class Ex8_2 {
	public static void main(String[] args) {
		System.out.println(1+" try블럭문 전");
		try {
			System.out.println(0/0+" try블럭문 0/0 실행");
			System.out.println(2+" try블럭문");	//실행되지 않는다.
		} catch(Exception ae) {
			System.out.println(3+" catch블럭문실행 ae");	
		}
		
		System.out.println(4+ " try블럭문 끝~~");
	}
}