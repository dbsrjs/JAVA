package sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {7, 5, 4, 3, 1};
		System.out.println("Array Length : " + array.length);
		System.out.println("source : " + Arrays.toString(array));
		
		 for (int i = 1; i < array.length; i++) {
			 for (int j = 0; j < array.length - i; j++) {
				 if(array[j] > array[j+1]) {
					 int temp = array[j + 1];
					 array[j+1] = array[j];
					 array[j] = temp; 
					 } 
				 }
			 System.out.println("pass-" + i + ": " + Arrays.toString(array)); 
			 }	 
		 System.out.println("result:" + Arrays.toString(array));		 
	}
}
