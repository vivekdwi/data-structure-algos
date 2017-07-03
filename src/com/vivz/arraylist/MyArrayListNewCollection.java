package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivz
 *
 */
public class MyArrayListNewCollection {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//adding element to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		System.out.println("Actual ArrayList : "+al);
		List<String> list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		//addAll() method adds all elements from List to ArrayList
		al.addAll(list);
		System.out.println("After Copying List elements new ArrayList : "+al);
	}
}
