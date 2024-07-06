package sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] dim = {7, 5, 4, 3, 1};
		System.out.println("Array Length : " + dim.length);
		System.out.println("source : " + Arrays.toString(dim));
		
		for (int i = 0; i < dim.length; i++) {
			for (int j = i; j > 0; j--) {
				if(dim[j-1] > dim[j]) {
					int tmep = dim[j - 1];
					dim[j - 1] = dim[j];
					dim[j] = tmep;
				}
			}
			System.out.println("pass-" + i + " : " + Arrays.toString(dim));
		}
		System.out.println("result : " + Arrays.toString(dim));
	}
}
