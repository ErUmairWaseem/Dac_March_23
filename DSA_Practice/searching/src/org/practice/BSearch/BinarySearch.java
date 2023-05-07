package org.practice.BSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	private static int BinarySearchAlgo(int[] arr, int k) {
		int left = 0, right = arr.length-1, mid;
		while(left <= right) {
			mid = (left + right)/2;
			
			if(k == arr[mid])
				return mid;
			
			if(k < arr[mid])
				right = mid -1;
			else
				left = mid +1;
		}
		return -1;

	}	
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int [] arr = {88,33,66,22,96,65,11,120,23};
			 Arrays.sort(arr);
			 
			 
			System.out.println("Enter Key");
			int k = sc.nextInt();
			
			int index =BinarySearchAlgo(arr, k);
			
			if(index != -1)
				System.out.println("Key is found at index "+index);
			
			else
				System.out.println("Key is not found");
		}
		 
	}

	
}
