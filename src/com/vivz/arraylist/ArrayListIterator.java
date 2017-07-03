package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Vivz
 *
 */
public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//adding elements to the end
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		
		//iterating ArrayList elements
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
