package com.vivz.ds.stack;

/**
 * @author Vivz
 *
 */
public class MyDynamicStack {
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	/**
	 * Constructor to create stack with size
	 * @param size
	 */
	public MyDynamicStack(int size){
		this.stackSize=size;
		this.stackArr=new int[stackSize];
		this.top=-1;
	}
	
	/**
	 * This method adds element on the top
	 * of the stack
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry){
		if(this.isStackFull()){
//			System.out.println("Stack is full increasing stack capacity");
			this.increaseStackCapacity();
		}
		System.out.println("Adding element : "+entry);
		this.stackArr[++top]=entry;
	}
	
	/**
	 * This method removes an element from
	 * the top of the stack
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception{
		if(this.isStackEmpty()){
			throw new Exception("Stack is empty");
		}
		int entry=this.stackArr[top--];
		System.out.println("Removing element : "+entry);
		return entry;
	}
	
	/**
	 * This Method increases the capacity of
	 * Stack
	 */
	public void increaseStackCapacity(){
		int[] newStack=new int[stackSize*2];
		for(int i=0; i<stackSize;i++){
			newStack[i]=this.stackArr[i];
		}
		this.stackArr=newStack;
		this.stackSize=this.stackSize*2;
	}
	
	
	/**
	 * This method returns top element of stack
	 * without removing it
	 * @return
	 */
	public int peek(){
		return stackArr[top];
	}
	
	/**
	 * This method returns true if stack is full
	 * @return
	 */
	public boolean isStackFull(){
		return (top==stackSize-1);
	}
	
	/**
	 * This method returns true if stack is empty
	 * @return
	 */
	public boolean isStackEmpty(){
		return (top==-1);
	}
	
	
	public static void main(String[] args) {
		MyDynamicStack stack=new MyDynamicStack(2);
		try{
			for(int i=1;i<10;i++){
				stack.push(i);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		for(int i=1;i<4;i++){
			try{
				stack.pop();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
