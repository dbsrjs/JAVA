package jch08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8_5v3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0, result = 0;
		
		System.out.print("1.숫자를 입력하세요");
		try {
			n1 = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("1 입력형식 예외 발생");
			e.printStackTrace();
		}
		System.out.print("2.숫자를 입력하세요");
		try {
			n2 = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("2 입력방식 예외 발생");
			e.printStackTrace();
		}
		try {
			result = n1 / n2;
		} catch(ArithmeticException e) {
			System.out.println("3.0으로 나눌 수 없음");
			e.printStackTrace();
		}
		System.out.printf("%d/%d=%d\n", n1, n2, result);
	}
}