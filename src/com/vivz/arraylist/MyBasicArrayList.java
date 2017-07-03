package com.vivz.arraylist;

import java.util.ArrayList;

/**
 * @author Vivz
 *
 */
public class MyBasicArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//adding elements to the ArrayList
		al.add("JAVA");
		al.add("ATG");
		al.add("JBOSS");
		al.add("WEBLOGIC");
		System.out.println(al);
		//gets elements by index
		System.out.println("Element at index 1 : "+al.get(1));
		System.out.println("Does List contains JAVA ? "+al.contains("JAVA"));
		//add elements at a specific index
		al.add(2, "ENDECA");
		System.out.println("Is arraylist empty ? "+al.isEmpty());
		System.out.println("Index of JBOSS is : "+al.indexOf("JBOSS"));
		System.out.println("Size of arraylist is : "+al.size());
		System.out.println(al);
	}
}
