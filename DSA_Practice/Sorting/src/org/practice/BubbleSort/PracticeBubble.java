package org.practice.BubbleSort;

import java.util.Arrays;

public class PracticeBubble {
	
	private static void bubbleSorting(int[] arr) {
		int n= arr.length;
		
		for(int i=0; i<n-1; i++) {
			for( int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {6,4,8,10,20,15,38,22,12};
		System.out.print("Before Sorting: "+Arrays.toString(arr)+" ");
		System.out.println();
		Arrays.sort(arr);
		
		bubbleSorting(arr);
		System.out.println(Arrays.toString(arr)+" ");
	}

	

}
