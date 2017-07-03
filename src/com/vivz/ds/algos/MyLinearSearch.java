package com.vivz.ds.algos;

/**
 * @author Vivz
 *
 */
public class MyLinearSearch {
	
	/**
	 * This method performs searching operation
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int linearSearch(int arr[], int key){
		int size=arr.length;
		for(int i=0;i<size;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1={25,56,88,12,6,89,100,421};
		int searchKey=89;
		
		if(linearSearch(arr1, searchKey)==-1){
			System.out.println("Element Not Found");
		}
		else{
			System.out.println("Key "+searchKey+" found at index : "+linearSearch(arr1, searchKey));
		}
		
		int[] arr2={55,68,26,59,555,24,65,68,45,566};
		searchKey=568;
		
		if(linearSearch(arr1, searchKey)==-1){
			System.out.println("Element Not Found");
		}
		else{
			System.out.println("Key "+searchKey+" found at index : "+linearSearch(arr1, searchKey));
		}
	}
}
