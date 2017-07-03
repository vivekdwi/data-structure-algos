package com.vivz.producerconsumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Vector sharedQueue = new Vector();
		int size=5;
		
		Thread prodThread = new Thread(new Producer(sharedQueue, size), "producer");
		Thread consThread = new Thread(new Consumer(sharedQueue, size), "consumer");
		prodThread.start();
		consThread.start();
	}
}

class Producer implements Runnable{
	private final Vector sharedQueue;
	private final int SIZE;
	
	public Producer(Vector sharedQueue, int size){
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}
	
	public void run(){
		for(int i=0; i<7; i++){
			System.out.println("Produced : "+i);
			try{
				produce(i);
			}catch(InterruptedException ex){
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
	
	private void produce(int i) throws InterruptedException{
		while(sharedQueue.size() == SIZE){
			synchronized (sharedQueue) {
				System.out.println("Queue is full : "+Thread.currentThread().getName()+
						" is waiting, size : "+sharedQueue.size());
				sharedQueue.wait();
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
	}
}

class Consumer implements Runnable{
	private final Vector sharedQueue;
	private int SIZE;
	
	public Consumer(Vector sharedQueue, int size){
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}
	
	public void run(){
		while(true){
			try{
				System.out.println("Consumed : "+consume());
				Thread.sleep(50);
			}catch(InterruptedException ex){
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
	
	private int consume() throws InterruptedException{
		while(sharedQueue.isEmpty()){
			synchronized (sharedQueue) {
				System.out.println("Queue is Emmpty : "+Thread.currentThread().getName()+
						" is waiting, size : "+sharedQueue.size());
				sharedQueue.wait();
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			return (Integer) sharedQueue.remove(0);
		}
	}
}
