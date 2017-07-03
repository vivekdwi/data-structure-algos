package com.vivz.arraylist;

import java.util.ArrayList;

/**
 * @author Vivz
 *
 */
public class ClearMyArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//add elements at the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		System.out.println("Actual ArrayList : "+al);
		//clear method removes all the objects from ArrayList
		al.clear();
		System.out.println("ArrayList after clear operation : "+al);
	}
}
