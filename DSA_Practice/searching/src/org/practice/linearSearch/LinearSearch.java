package org.practice.linearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int [] arr = {88,33,66,22,96,65,11,120,23};
			
			System.out.println("Enter Key");
			int k = sc.nextInt();
			
			int index =linearSearchAlgo(arr, k);
			
			if(index != -1)
				System.out.println("Key is found at index "+index);
			
			else
				System.out.println("Key is not found");
		}
	}

	private static int linearSearchAlgo(int[] arr, int k) {
		for(int i=0; i< arr.length; i++) {
			if(k == arr[i])
				return i;
		}
		return -1;
		
	}

	
}
