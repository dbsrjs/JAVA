package jch08;

public class Ex8_5 {
	public static void main(String[] args) {
		System.out.println(1+" try블럭문 전");
		System.out.println(2+" try블럭문 전");
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);   	//실행되지 않는다.
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}
}