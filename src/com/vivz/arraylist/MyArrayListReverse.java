package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListReverse {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vivek");
		al.add("Dwivedi");
		al.add("ATG Developer");
		al.add("Now");
		al.add("Vivz");
		System.out.println("Actual ArrayList : "+al);
		Collections.reverse(al);
		System.out.println("Result After Reverse Operation : "+al);
	}
}
