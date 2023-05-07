package org.practice.mergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int[] arr, int left, int right) {
		//if partition is invalid or have single element, then return
		if(left>right || left == right)
			return;
		//devide array in two equal partition
			int mid = (left+right)/2;
		//sort left partition(left to mid)
			mergeSort(arr, left, mid);
		//sort right partition(mid+1 to right)
			mergeSort(arr, mid+1, right);
		//temporary array to accommodate both partition
			int [] temp = new int [right - left +1];
			//merge two sorted partition into temp array
		    int i=left, j=mid+1, k=0;
			//compare elements from both partitions and copy the smaller one (until any one partition is done)
		    while(i <=mid && j<=right) {
			    if(arr[i] < arr[j]) {
			    	temp[k++] = arr[i++];
			    	//k++;
			    	//i++;
			    }
			    else
			    	temp [k++] = arr[j++];
		    }
		    //copy remaining elements from other partition
		    while (i<= mid)
		    	temp[k++] = arr[i++];
		    while(i<= right)
		     	temp[k++] = arr[j++];
		    //overwrite temp array back to original array
		    for (i = 0; i < temp.length; i++) {
				arr[left+i] = temp[i];
			}
	}
	public static void main(String[] args) {
		int [] arr = {8,3,9,1,5,7,2,6,4};
		System.out.println(Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}