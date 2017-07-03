package com.vivz.multithreading;

public class TaskEvenOdd implements Runnable{

	private int max;
	private PrintEvenOdd printer;
	private boolean isEvenNumber;
	
	public TaskEvenOdd(PrintEvenOdd printer, int max, boolean isEvenNumber) {
		this.printer = printer;
		this.max = max;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {
		int number = isEvenNumber ? 2 :1;
		while(number <= max){
			if(isEvenNumber){
				printer.printEven(number);
			}else{
				printer.printOdd(number);
			}
			number += 2;
		}
	}
}
