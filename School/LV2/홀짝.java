package main;

import java.util.Iterator;

public class gkq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		
		for (int i = 0; i <= 999; i++) {
			
			if (i % 2 == 0) {
				num1 += i;
			}
			
			else	{
				num2 += i;
			}					
		}
		
		System.out.println("짝수 합 : " + num1);
		System.out.println("홀수 합 : " + num2);
	}
}
