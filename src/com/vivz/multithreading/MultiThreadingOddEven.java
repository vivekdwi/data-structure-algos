package com.vivz.multithreading;

import java.util.Scanner;

public class MultiThreadingOddEven {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		PrintEvenOdd printer = new PrintEvenOdd();
		System.out.println("Even Odd Example Using Multi Threading");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Maximum Limit To Print : ");
		int max = sc.nextInt();
		Thread thread1 = new Thread(new TaskEvenOdd(printer, max, Boolean.FALSE));
		thread1.setName("Odd Number Thread");
		Thread thread2 = new Thread(new TaskEvenOdd(printer, max, Boolean.TRUE));
		thread2.setName("Even Number Thread");
		thread1.start();
		thread2.start();
	}
}
