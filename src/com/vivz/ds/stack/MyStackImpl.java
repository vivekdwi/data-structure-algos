package com.vivz.ds.stack;

/**
 * @author Vivz
 *
 */
public class MyStackImpl {
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	/**
	 * Constructor to create stack with size
	 * @param size
	 */
	public MyStackImpl(int size){
		this.stackSize=size;
		this.stackArr=new int[stackSize];
		this.top=-1;
	}
	
	
	/**
	 * This method adds element at the top
	 * of the stack
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry) throws Exception{
		if(this.isStackFull()){
			throw new Exception("Stack is full.");
		}
		System.out.println("Adding element : "+entry);
		this.stackArr[++top]=entry;
	}
	
	
	/**
	 * This method removes element from the
	 * top of the stack
	 * @return entry
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
	 * This method returns true if Stack
	 * is empty
	 * @return
	 */
	public boolean isStackEmpty(){
		return (top==-1);
	}
	
	
	/**
	 * This method returns true if stack
	 * is Full
	 * @return
	 */
	public boolean isStackFull(){
		return (top==stackSize-1);
	}
	
	
	
	/**
	 * This method returns top element of stack 
	 * without removing it
	 * @return
	 */
	public int peek(){
		return stackArr[top];
	}
	
	
	public static void main(String[] args) {
		MyStackImpl stack=new MyStackImpl(5);
		try{
			stack.push(56);
			stack.push(45);
			stack.push(89);
			stack.push(12);
			stack.push(3);
//			stack.pop();
			stack.push(55);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------------------");
		try{
			System.out.println("***top element of stack***");
			System.out.println(stack.peek());
			System.out.println("-----------------------------");
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
