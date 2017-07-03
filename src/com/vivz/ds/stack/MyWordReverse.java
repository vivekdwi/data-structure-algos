package com.vivz.ds.stack;

/**
 * @author Vivz
 *
 */
public class MyWordReverse {
	
	/**
	 * This method returns the reverse of string
	 * @param word
	 * @return
	 */
	public String reverseWord(String word){
		StringBuilder sb=new StringBuilder();
		int size=word.length();
		StackImpl stack=new StackImpl(size);
		for(int i=0;i<size;i++){
			stack.push(word.charAt(i));
		}
		
		while(!stack.isStackEmpty()){
			sb.append(stack.pop());
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		MyWordReverse mwr=new MyWordReverse();
		
		System.out.println("Hi this is vivz");
		System.out.println(mwr.reverseWord("Hi this is vivz"));
	}
}


class StackImpl{
	private int stackSize;
	private char[] stackArr;
	private int top;
	
	/**
	 * Construct to create stack with size
	 * @param size
	 */
	StackImpl(int size){
		this.stackSize=size;
		this.stackArr=new char[stackSize];
		this.top=-1;
	}
	
	/**
	 * This method adds entry in stack
	 * @param entry
	 */
	public void push(char entry){
		stackArr[++top]=entry;
	}
	
	/**
	 * This method remove entry from stack
	 * @return
	 */
	public char pop(){
		char entry=stackArr[top--];
		return entry;
	}
	
	/**
	 * This method returns true if stack is empty
	 * @return
	 */
	public boolean isStackEmpty(){
		return (top==-1);
	}
}
