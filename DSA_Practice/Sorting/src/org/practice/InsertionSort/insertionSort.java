package org.practice.InsertionSort;

import java.util.Arrays;

public class insertionSort {
	
	public static void insertSort(int[] arr) {
		//n-1 passes : in each pass consider ith element as last index of array.
		for (int i=1; i<arr.length; i++) {
			//copy of last element into temp var
			int j, temp = arr[i];     //consider ith element is the last element of array
			//compare temp will all elements before that,find appropriate position for the element and insert temp at that position 
			for( j=i-1; j>=0 && arr[j]> temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {6,4,2,8,3,1};
		
		
		System.out.println("Before Sorting "+Arrays.toString(arr));
		insertSort(arr);
		System.out.println("After Sorting "+ Arrays.toString(arr));
	}
}