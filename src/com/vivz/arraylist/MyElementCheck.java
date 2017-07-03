package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivz
 *
 */
public class MyElementCheck {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//adds element at the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		
		List<String> list=new ArrayList<String>();
		list.add("Second");
		list.add("Fourth");
		//containsAll() method checks weather ArrayList contains all elements of List or not
		System.out.println("Does ArrayList Contains all List elements ? "+al.containsAll(list));
		list.add("One");
		System.out.println("Does ArrayList Contains all List elements ? "+al.containsAll(list));
	}
}
