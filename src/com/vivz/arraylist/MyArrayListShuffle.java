package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vivz
 *
 */
public class MyArrayListShuffle {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//add elements at the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Fifth");
		al.add("Random");
		System.out.println("Actual ArrayList : "+al);
		
		//shuffle() method generates different order of elements every time when we will call.
		Collections.shuffle(al);
		System.out.println("Result after shuffle operation : ");
		for(String s1:al){
			System.out.println(s1);
		}
		System.out.println("-----------------");
		Collections.shuffle(al);
		System.out.println("Result after shuffle operation : ");
		for(String s2:al){
			System.out.println(s2);
		}
	}
}
