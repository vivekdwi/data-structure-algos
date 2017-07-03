package com.vivz.arraylist;

import java.util.ArrayList;

/**
 * @author Vivz
 *
 */
public class MyArrayListArray {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//add element at the end of ArrayList
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		System.out.println("Actual ArrayList : "+al);
		
		String[] arr=new String[al.size()];
		//toArray() method copy all the elements from ArrayList to array
		al.toArray(arr);
		System.out.println("\nCreated Array Content : ");
		for(String s1:arr){
			System.out.println(s1);
		}
	}
}
