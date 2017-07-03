package com.vivz.ds.algos;

/**
 * @author Vivz
 *
 */
public class MyBinarySearch {
	
	/**
	 * This method performs binary search
	 * @param arr
	 * @param key
	 * @return
	 */
	public int binarySearch(int[] arr,int key){
		int  start=0;
		int size=arr.length;
		int end=size-1;
		
		while(start<=end){
			int mid=(start+end)/2;
			if(key==arr[mid]){
				return mid;
			}
			if(key<arr[mid]){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MyBinarySearch mbs=new MyBinarySearch();
		
		int[] arr1={4,6,8,10,12,14,16,18,20};
		int searchKey=14;
		
		if(mbs.binarySearch(arr1, searchKey)==-1){
			System.out.println("Element Not Found");
		}
		else{
			System.out.println("Key "+searchKey+" found at index : "+mbs.binarySearch(arr1, searchKey));
		}
		
		int[] arr2={14,16,18,20,22,24,26,28,30};
		searchKey=25;
		
		if(mbs.binarySearch(arr2, searchKey)==-1){
			System.out.println("Element Not Found");
		}
		else{
			System.out.println("Key "+searchKey+" found at index : "+mbs.binarySearch(arr2, searchKey));
		}
	}
}
