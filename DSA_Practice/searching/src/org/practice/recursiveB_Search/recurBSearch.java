package org.practice.recursiveB_Search;

import java.util.Arrays;
import java.util.Scanner;

public class recurBSearch {

	public static int recuBinarySearch(int[] arr, int key, int left, int right) {
		int index, mid = (left + right)/2;
		if(right < left)
			return -1;
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
			index = recuBinarySearch(arr,key,left, mid-1);
		else
			index = recuBinarySearch(arr, key, mid+1, right);
		return index;
	}

	public static void main(String[] args) {
		int [] arr = {11,55,3,69,41,23,5,25,68,95,12};
		Arrays.sort(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element you want to search  :	");
		int key = sc.nextInt();
		
		int index = recuBinarySearch(arr, key ,0, arr.length-1);
		
		if(index != -1)
			System.out.println(key+" is present at index "+index);
		else
			System.out.println(key+" is not present in an array");
	}

	
	
}
