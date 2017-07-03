package com.vivz.ds.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Vivz
 *
 */
public class MyLinkedListIterator {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Random");
		System.out.println("Actual LinkedList : "+ll);
		
		Iterator<String> it=ll.iterator();
		System.out.println("Result after iterator operation : ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
