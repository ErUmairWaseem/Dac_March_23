package org.practice.quickSort;

import java.util.Arrays;

public class QuickSortNew {
	public static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static void quickSort(int [] arr, int left, int right) {
		//0. if partition has single element or invalid partition, return
		if(left >= right)
			return; 
		//consider left ele as pivot--> arr[left]
		int pivot = arr[left];
		int i=0, j=right;
		while(i<j) {
			
			//1.from left(ith index) find ele greater then pivot.
			while(i<=right && arr[i] <= pivot) {
				i++;
			}
			//2.from right(jth index) find ele less  then or equal to pivot
			while(arr[j]> pivot) {
				j--;
			}
			//3.if is i < j, swap i with j
			if(i<j)
				swap(arr,i,j);
		}
		//4.repeat 1,2,3 till i >= j 
		//5.swap j with pivot
		swap(arr,j,left);
		//6. apply quick sor to left partition(left to j-1)
		quickSort(arr, left, j-1);
		//7. apply quick sor to left partition(j+1 to right)
		quickSort(arr, j+1, right);
	}
	public static void main(String[] args) {
		//int [] arr = {5,3,9,1,8,-202,7,2,6,4,35};
		//int [] arr = {4,3,2,1};
		int arr [] = new int [] {15,34,68,46,5};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
