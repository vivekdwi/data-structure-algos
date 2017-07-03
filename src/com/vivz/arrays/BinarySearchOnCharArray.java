package com.vivz.arrays;

import java.util.Arrays;

/**
 * @author Vivz
 *
 */
public class BinarySearchOnCharArray {
	
	public static void main(String[] args) {
		char charArr[]={'a','b','c','d','e','y','q'};
		int index=Arrays.binarySearch(charArr, 0, charArr.length-1, 'y');
		System.out.println("Index of y is "+index);
	}
}
