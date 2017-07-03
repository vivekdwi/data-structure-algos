package com.vivz.ds.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivz
 *
 */
public class DoubleEndedQueueImpl {

	private List<Integer> deque=new ArrayList<Integer>();
	
	
	public void insertFront(int item){
		//add element at the beginning of the queue
		System.out.println("Adding item at front : "+item);
		deque.add(0, item);
		System.out.println(deque);
	}
	
	
	public void insertRear(int item){
		//add element at the end of the queue
		System.out.println("Adding item at rear : "+item);
		deque.add(item);
		System.out.println(deque);
	}
	
	public void removeFront(){
		if(deque.isEmpty()){
			System.out.println("Queue Underflow...!!! unable to remove item");
			return;
		}
		//remove an item from the beginning of the queue
		int rem=deque.remove(0);
		System.out.println("Removed from front : "+rem);
		System.out.println(deque);
	}
	
	public void removeRear(){
		if(deque.isEmpty()){
			System.out.println("Queue Underflow...!!! unable to remove item");
			return;
		}
		//remove an item from the end of the queue
		int rem=deque.remove(deque.size()-1);
		System.out.println("Removed from rear : "+rem);
		System.out.println(deque);
	}
	
	public int peakFront(){
		//gets the element from front without removing it
		int item=deque.get(0);
		System.out.println("Element at front : "+item);
		return item;
	}
	
	public int peakRear(){
		//gets an element from rear without removing it
		int item=deque.get(deque.size()-1);
		System.out.println("Element at rear : "+item);
		return item;
	}
	
	public static void main(String[] args) {
		DoubleEndedQueueImpl deq=new DoubleEndedQueueImpl();
		deq.insertFront(58);
		deq.insertFront(65);
		deq.insertRear(66);
		deq.removeFront();
		deq.removeFront();
		deq.removeFront();
		deq.removeRear();
	}
}
