package com.vivz.ds.queue;

public class DynamicQueueImpl {
	
	private int capacity=2;
	int[] queueArr;
	int front=0;
	int rear=-1;
	int currentSize=0;
	
	DynamicQueueImpl(){
		queueArr=new int[this.capacity];
	}
	
	/**
	 * This method adds element at the end of the queue
	 * @param item
	 */
	public void enqueue(int item){
		if(isQueueFull()){
			System.out.println("Overflow!!! Increasing capacity of queue....");
			increaseCapacity();
		}
		rear++;
		if(rear >= queueArr.length && currentSize != queueArr.length){
			rear=0;
		}
		queueArr[rear]=item;
		System.out.println("Element "+item+" is pushed to queue");
		currentSize++;
	}
	
	/**
	 * This method removes element from the top of the queue
	 */
	public void dequeue(){
		if(isQueueEmpty()){
			System.out.println("Underflow!!! unable to removw item from queue....");
		}
		else{
			front++;
			if(front>queueArr.length-1){
				System.out.println("Pop operation done removed : "+queueArr[front-1]);
				front=0;
			}
			else{
				System.out.println("Pop operation done removed : "+queueArr[front-1]);
			}
			currentSize--;
		}
	}
	
	/**
	 * This method increase the capacity of queue
	 */
	private void increaseCapacity(){
		//create new array with double size as the current one
		int newCapacity=this.queueArr.length*2;
		
		//copy elements to new array, copy from rear to front
		int[] newArr=new int[newCapacity];
		int tempFront=front;
		int index=-1;
		while(true){
			newArr[++index]=this.queueArr[tempFront];
			tempFront++;
			if(tempFront==this.queueArr.length){
				tempFront=0;
			}
			if(currentSize==index+1){
				break;
			}
		}
		//make new array as queue
		this.queueArr=newArr;
		System.out.println("New Array Capacity = "+this.queueArr.length);
		
		//reset front & rear values
		this.front=0;
		this.rear=index;
	}
	
	/**
	 * This method returns true if queue is full
	 * @return
	 */
	public boolean isQueueFull(){
		boolean status=false;
		if(currentSize==capacity-1){
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
		DynamicQueueImpl queue=new DynamicQueueImpl();
		queue.enqueue(4);
		queue.dequeue();
		queue.enqueue(56);
		queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.enqueue(24);
        queue.enqueue(98);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(435);
        queue.dequeue();
        queue.dequeue();
	}
}
