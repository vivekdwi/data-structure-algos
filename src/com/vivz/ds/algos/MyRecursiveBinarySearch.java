package com.vivz.ds.algos;

/**
 * @author Vivz
 *
 */
public class MyRecursiveBinarySearch {
	
	
	/**
	 * This method performs recursive binary search
	 * @param sortedArray
	 * @param start
	 * @param end
	 * @param key
	 * @return
	 */
	public int recursiveBinarySearch(int[] sortedArray,int start, int end, int key){
		if(start<end){
			int mid=(start+end)/2;
			if(key<sortedArray[mid]){
				return recursiveBinarySearch(sortedArray, start, mid, key);
			}
			else if(key>sortedArray[mid]){
				return recursiveBinarySearch(sortedArray, mid+1, end, key);
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MyRecursiveBinarySearch mrbs=new MyRecursiveBinarySearch();
		int[] arr1={25,45,86,486,492,560,670,890,910,990,1000};
		int size=arr1.length;
		int searchKey=49;
		int index=mrbs.recursiveBinarySearch(arr1, 0, size, searchKey);
		System.out.println("Key "+searchKey+" found at index : "+index);
	}
}
