package jch08;

public class Ex8_5v1 {
	public static void main(String[] args) {
		System.out.println(1+" try블럭문 전");
		System.out.println(2+" try블럭문 전");
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외발생
			System.out.println(4);   	//실행되지 않는다.
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외Arimetic : " + ae.getMessage());
		} catch (RuntimeException ae) {
			ae.printStackTrace();
			System.out.println("예외 Runtime : " + ae.getMessage());
		} catch(Exception ae) {
			System.out.println("예외Exception : " + ae.getMessage());
		}
		
		System.out.println(6);
	}
}