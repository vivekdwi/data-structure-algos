package com.vivz.arrays;

import java.util.Arrays;

/**
 * @author Vivz
 *
 */
public class MyArrayRangeCopy {

		public static void main(String[] args) {
			int myArr[]={4,2,9,3,6,8,5};
			System.out.println("My Array Elements : \n");
			for(int m:myArr){
				System.out.print(m+" ");
			}
			System.out.println("\nMy New Array Elements : \n");
			int newArr[]=Arrays.copyOfRange(myArr, 2, 4);
			for(int n:newArr){
				System.out.print(n+" ");
			}
		}
}
