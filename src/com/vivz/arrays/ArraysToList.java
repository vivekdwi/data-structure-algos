package com.vivz.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author Vivz
 *
 */
public class ArraysToList {
	
	public static void main(String[] args) {
		String strArr[]={"JAVA","C","ATG","C++"};
		List<String> strList=Arrays.asList(strArr);
		System.out.println("Created List Size : "+strList.size());
		System.out.println(strList);
	}
}
