package com.vivz.arrays;

import java.util.Arrays;

/**
 * @author Vivz
 *
 */
public class MyArrayDeepEquals {
	
	public static void main(String[] args) {
		String[] strArr={"JAVA","ATG","ATG DYNAMO","JBOSS"};
		String[] strArrCopy={"JAVA","ATG","ATG DYNAMO","JBOSS"};
		System.out.println("Are strArr and strArrCopy same ? "+Arrays.deepEquals(strArr, strArrCopy));
		
		String[] strArrMod={"JAVA","ATG","ATG DYNAMO","JDBC"};
		System.out.println("Are strArr and strArrmod same ? "+Arrays.deepEquals(strArr, strArrMod));
	}
}
