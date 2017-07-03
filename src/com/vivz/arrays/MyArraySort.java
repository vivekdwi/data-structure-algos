package com.vivz.arrays;

import java.util.Arrays;

/**
 * @author Vivz
 *
 */
public class MyArraySort {

	public static void main(String[] args) {
		int[] myArr={3,2,1,56,8,56,9,7};
		Arrays.sort(myArr);
		for(int i:myArr){
			System.out.print(i+" ");
		}
	}
}
