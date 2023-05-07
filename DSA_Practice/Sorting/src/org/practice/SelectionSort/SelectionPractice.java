
package org.practice.SelectionSort;

import java.util.Arrays;

public class SelectionPractice {
	private static void selectionSort(int[] arr) {
		int n= arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	

	public static void main(String[] args) {
		
		int [] arr = {6,4,8,10,20,15,38,22,12};
		selectionSort(arr);
		
	}

}
