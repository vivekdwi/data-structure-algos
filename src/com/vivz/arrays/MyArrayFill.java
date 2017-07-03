package com.vivz.arrays;

import java.util.Arrays;

/**
 * @author Vivz
 *
 */
public class MyArrayFill {

		public static void main(String[] args) {
			String myArr[]=new String[5];
			Arrays.fill(myArr, "Customized Default Value");
			for(String s1:myArr){
				System.out.println(s1);
			}
		}
}
