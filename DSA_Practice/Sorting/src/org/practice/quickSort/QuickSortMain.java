package org.practice.quickSort;
import java.util.Arrays;

public class QuickSortMain {
	static void swap(int [] arr,int l,int j) {
		 int temp =arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
	}
	
	static int quickSort(int arr[],int l ,int h) {
		 int pivot = arr[l];
		   int i = l+1;
	        int j = h;
	        while(i<j) {
	        	if(i<=h && arr[i]<=pivot) {
	        		if(pivot>arr[j]) {
	        			swap(arr,i,j);
	        		}
	        		else {
	        			j--;
	        		}
	        	}
	        	else {
	        		i++;
	        	}
	        }
	        j--;
	        swap(arr,l,j);
	        return j;
	}
	static void partition(int arr [],int l,int h) {
		if(l<h) {
			
			int pivotIndex = quickSort(arr,l,h);
			partition(arr,l,pivotIndex);
			partition(arr,pivotIndex+1,h);
			
		}
	}
public static void main(String[] args) {
	int arr [] = new int [] {15,34,68,46,5};
    System.out.println(Arrays.toString(arr));
    partition(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
}
}

/*public class QuickSortMain {
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivotindex = partition(arr,low,high);
			
			quickSort(arr, low, pivotindex -1);   //for element less then pivot
			
			quickSort(arr, pivotindex+1, high);   //for elements greater then pivot 
		}
	}
	
	private static int partition(int[] arr, int low, int high) {
		//choose pivot at last index
		int pivot = arr[high];
		int i = low -1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;  // pivot index
	}

	public static void main(String[] args) {
		int [] arr = {6,3,9,5,2,8};
		int n = arr.length;
		quickSort(arr, 0 ,n-1);
		
		//print
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
}*/
