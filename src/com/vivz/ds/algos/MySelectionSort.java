package com.vivz.ds.algos;

/**
 * @author Vivz
 *
 */


/**
 * The selection sort is a combination of searching and sorting.
 * During each pass, the unsorted element with the smallest (or largest)
 * value is moved to its proper position in the array. The number of
 * times the sort passes through the array is one less than the number
 * of items in the array. In the selection sort, the inner loop finds
 * the next smallest (or largest) value and the outer loop places that
 * value into its proper location.
 *
 */

public class MySelectionSort {
	
	/**
	 * This method performs selection sort operation
	 * @param array
	 * @return
	 */
	public static int[] selectionSort(int[] array){
		int length=array.length;
		for(int i=0;i<length-1;i++){
			int index=i;
			for(int j=i+1;j<length;j++)
				if(array[j]<array[index])
					index=j;
			int smallestNumber=array[index];
			array[index]=array[i];
			array[i]=smallestNumber;
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] arr1={5,0,2,3,-5,15,23,12,10,9};
		int[] arr2=selectionSort(arr1);
		for(int i:arr2){
			System.out.print(i+",");
		}
	}
}
