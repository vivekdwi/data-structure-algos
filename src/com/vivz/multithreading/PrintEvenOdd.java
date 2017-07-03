package com.vivz.multithreading;

public class PrintEvenOdd {

	boolean isOdd = Boolean.FALSE;
	
	synchronized void printEven(int number){
		while(!isOdd){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Even Number : "+number);
		isOdd = Boolean.FALSE;
		notifyAll();
	}
	
	synchronized void printOdd(int number){
		while(isOdd){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Odd Number : "+number);
		isOdd = Boolean.TRUE;
		notifyAll();
	}
}
