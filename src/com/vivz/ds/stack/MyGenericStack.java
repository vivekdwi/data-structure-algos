package com.vivz.ds.stack;

/**
 * @author Vivz
 */
public class MyGenericStack<T extends Object> {
	
	private int stackSize;
	private T[] stackArr;
	private int top;
	
	/**
	 * Constructor to create stack with size
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public MyGenericStack(int size){
		this.stackSize=size;
		this.stackArr=(T[])new Object[stackSize];
	}
	
	/**
	 * This method adds new entry to the top of the stack
	 * @param entry
	 */
	public void push(T entry){
		if(this.isStackFull()){
			System.out.println("Stack size is full increasing stack capacity");
			this.increaseCapacity();
		}
		System.out.println("Adding : "+entry);
		stackArr[++top]=entry;
	}
	
	/**
	 * This method removes an entry from the top of the stack
	 * @return
	 * @throws Exception
	 */
	public T pop() throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		T entry=this.stackArr[top--];
		System.out.println("Removed "+entry+" from stack");
		return entry;
	}
	
	/**
	 * This method increases the capacity of stack.
	 */
	public void increaseCapacity(){
		@SuppressWarnings("unchecked")
		T[] newStack=(T[])new Object[stackSize*2];
		for(int i=0;i<stackSize;i++){
			newStack[i]=this.stackArr[i];
		}
		this.stackArr=newStack;
		this.stackSize=this.stackSize*2;
	}
	
	/**
	 * This method returns the top of the stack
	 * without removing it.
	 * @return
	 */
	public T peek(){
		return stackArr[top];
	}
	
	/**
	 * This method returns true if stack is full.
	 * @return
	 */
	public boolean isStackFull(){
		return (top==stackSize-1);
	}
	
	/**
	 * This method returns true if stack is empty.
	 * @return
	 */
	public boolean isStackEmpty(){
		return (top==-1);
	}
	
	public static void main(String[] args) {
		MyGenericStack<String> mgss=new MyGenericStack<String>(2);
		mgss.push("Hi this is vivz");
		mgss.push("vivek");
		mgss.push("dwivedi");
		
		MyGenericStack<Integer> mgsi=new MyGenericStack<Integer>(3);
		mgsi.push(10);
		mgsi.push(56);
		mgsi.push(58);
		mgsi.push(55);
		try{
			mgsi.pop();
			mgsi.pop();
			mgsi.pop();
			mgsi.pop();
			mgsi.pop();
			mgsi.pop();
			mgsi.pop();
			mgsi.pop();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
