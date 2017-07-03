package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vivz
 *
 */
public class MyArrayListSwap {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//add elements at the end
		al.add("Hi");
		al.add("this");
		al.add("is");
		al.add("vivz");
		al.add("ATG");
		al.add("Developer");
		System.out.println("Actua ArrayList : "+al);
		
		//swap() swaps two elements of ArrayList
		Collections.swap(al, 2, 4);
		System.out.println("Result after swap operation : ");
		for(String s1:al){
			System.out.println(s1);
		}
	}
}
