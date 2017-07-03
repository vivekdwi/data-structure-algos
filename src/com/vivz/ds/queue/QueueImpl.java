package com.vivz.ds.queue;

/**
 * @author Vivz
 *
 */
public class QueueImpl {
	
	private int capacity;
	int[] queueArr;
	int front=0;
	int rear=-1;
	int currentSize=0;
	
	/**
	 * Constructor too create queue with size
	 * @param size
	 */
	QueueImpl(int size){
		this.capacity=size;
		queueArr=new int[this.capacity];
	}
	
	/**
	 * This method adds element at the end of queue
	 * @param item
	 */
	public void enqueue(int item){
		if(isQueueFull()){
			System.out.println("Overflow!!! Unable to add "+item+" in queue");
		}
		else{
			rear++;
			if(rear==capacity-1){
				rear=0;
			}
			queueArr[rear]=item;
			System.out.println("Element "+item+" is pushed to queue");
			currentSize++;
		}
	}
	
	/**
	 * This method removes element from the top of the queue
	 */
	public void dequeue(){
		if(isQueueEmpty()){
			System.out.println("Underflow!!! Unable to remove element from queue");
		}
		else{
			front++;
			if(front==capacity-1){
				System.out.println("Pop operation done!!! removed : "+queueArr[front-1]);
				front=0;
			}
			else{
				System.out.println("Pop operation done!!! removed : "+queueArr[front-1]);
			}
			currentSize--;
		}
	}
	
	/**
	 * This method returns true if queue is full
	 * @return
	 */
	public boolean isQueueFull(){
		boolean status=false;
		if(currentSize==capacity){
			status=true;
		}
		return status;
	}
	
	/**
	 * This method returns true if queue is empty
	 * @return
	 */
	public boolean isQueueEmpty(){
		boolean status=false;
		if(currentSize==0){
			status=true;
		}
		return status;
	}
	
	public static void main(String[] args) {
		QueueImpl queue=new QueueImpl(4);
		queue.enqueue(4);
		queue.dequeue();
		queue.enqueue(56);
		queue.enqueue(2);
		queue.enqueue(67);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(24);
		queue.dequeue();
		queue.enqueue(98);
		queue.enqueue(25);
		queue.enqueue(43);
		queue.enqueue(425);
	}
}
