package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivz
 *
 */
public class MyArrayListSubRange {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//add element at the end of ArrayList
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		System.out.println("Actual ArrayList : "+al);
		//subList() method returns the elements from index to index from ArrayList
		List<String> list=al.subList(1, 3);
		System.out.println("Sublist of ArrayList : "+list);
	}
}
