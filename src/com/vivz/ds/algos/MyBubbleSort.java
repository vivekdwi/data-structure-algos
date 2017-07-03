package com.vivz.ds.algos;

/**
 * @author Vivz
 *
 */
public class MyBubbleSort {
	
	/**
	 * This method performs sorting process
	 * @param array
	 */
	public static void bubbleSort(int[] array){
		int length=array.length;
		int k;
		for(int m=length;m>0;m--){
			for(int i=0;i<length-1;i++){
				k=i+1;
				if(array[i]>array[k]){
					swapNumber(i,k,array);
				}
			}
		}
		System.out.println("Sorted Array : ");
		printNumber(array);
	}
	
	/**
	 * This method is used for swapping elements
	 * @param i
	 * @param j
	 * @param array
	 */
	public static void swapNumber(int i, int j, int[] array){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	/**
	 * This method prints the sorted array
	 * @param input
	 */
	public static void printNumber(int[] input){
		int lenght=input.length;
		for(int i=0;i<lenght;i++){
			System.out.print(input[i]+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr={56,4,52,2,3,0,1,25,15,16,5};
		System.out.println("Input Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
		System.out.println();
		bubbleSort(arr);
	}
}
