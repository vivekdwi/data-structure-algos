package com.vivz.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vivz
 *
 */
public class MyStringArraySorting {
	
	public static void main(String[] args) {
		String strArr[]={"JAVA","C","ATG","STRUTS"};
		
		Arrays.sort(strArr,new Comparator<String>() {
			
			public int compare(String o1, String o2){
				return o1.compareTo(o2);
			}
		});
		for(String str:strArr){
			System.out.println(str);
		}
	}
}
