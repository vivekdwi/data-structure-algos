package com.vivz.arrays;

import java.util.Arrays;

/**
 * @author Vivz
 *
 */
public class MyArrayCopy {

		public static void main(String[] args) {
			int myArr[]={2,5,8,7,6,5,3,4};
			System.out.println("Size of array before copying : "+myArr.length);
			int newArr[]=Arrays.copyOf(myArr, 15);
			System.out.println("Size of array after copying : "+newArr.length);
		}
}
