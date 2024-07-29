package jv_0712;

import java.util.Random;
import java.util.Scanner;

public class Rand {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("가로");
		int rows = sc.nextInt();	//garo
		
		System.out.println("세로");
		int cols = sc.nextInt();	//sero
		
		int[] set = new int[rows * cols];
		
		for (int i = 0; i < set.length; i++) {
			set[i] = rd.nextInt(rows*cols)+1;
			for (int j = 0; j < i; j++) {
				if(set[i] == set[j])
					i--;
			}
		}
		
		for (int i = 0; i < set.length; i++) {
			System.out.printf("%5d   ", set[i]);
			if(i!=0 && (i+1)%cols == 0)
				System.out.println();
		}
	}
}
