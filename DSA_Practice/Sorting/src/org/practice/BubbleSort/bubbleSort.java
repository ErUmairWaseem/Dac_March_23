package org.practice.BubbleSort;

import java.util.Arrays;

public class bubbleSort {
	
	public static void bubblesort(int arr[]) {
		
		for(int i=0; i< arr.length-1; i++) {
			
			for (int j=0; j< arr.length-1; j++) {
				// compare consecutive element
				// if left element > right element, swap
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
	}
public static void improvedbubblesort(int arr[]) {
		
		for(int i=0; i< arr.length-1; i++) {
			
			boolean swap = false;
			
			for (int j=0; j< arr.length-1-i; j++) {   //only change in this line
				
				// compare consecutive element
				// if left element > right element, swap
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swap = true;
				}	
			}
			if(!swap)
				break;
		}
	}
	public static void main(String[] args) {
		
		int [] arr = {6,4,2,8,3,1};
		System.out.println("Before Sorting "+Arrays.toString(arr));
		bubblesort(arr);
		System.out.println("After Sorting "+ Arrays.toString(arr));
		improvedbubblesort(arr); // it will increase the efficiency and decrease time complexity
		System.out.println("After Sorting "+ Arrays.toString(arr));


	}

}
