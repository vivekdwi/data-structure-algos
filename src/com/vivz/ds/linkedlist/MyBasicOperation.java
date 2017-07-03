package com.vivz.ds.linkedlist;

import java.util.LinkedList;

/**
 * @author Vivz
 *
 */
public class MyBasicOperation {
	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("Apple");
		ll.add("Orange");
		ll.add("Grapes");
		ll.add("Banana");
		ll.add("Guava");
		System.out.println(ll);
		System.out.println("Size of LinkedList : "+ll.size());
		System.out.println("Is LinkedList empty ? "+ll.isEmpty());
		System.out.println("Does LinkedList Contains Grapes ? "+ll.contains("Grapes"));
	}
}
