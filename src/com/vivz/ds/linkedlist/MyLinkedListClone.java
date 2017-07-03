package com.vivz.ds.linkedlist;

import java.util.LinkedList;

/**
 * @author Vivz
 *
 */
public class MyLinkedListClone {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Random");
		System.out.println("Actual List : "+ll);
		LinkedList<String> clone=(LinkedList<String>)ll.clone();
		System.out.println("Cloned List : "+clone);
	}
}
