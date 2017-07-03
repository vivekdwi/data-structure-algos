package com.vivz.arraylist;

import java.util.ArrayList;

/**
 * @author Vivz
 *
 */
public class MyArrayListClone {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//adding elements to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		System.out.println("Actual ArrayList : "+al);
		//performing cloning operation
		ArrayList<String> clone= (ArrayList<String>) al.clone();
		System.out.println("Cloned ArrayList : "+clone);
	}
}
