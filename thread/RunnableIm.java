package com.thread;

import java.util.Scanner;

public class RunnableIm implements Runnable {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Enter 1st no:");
		a = scan.nextInt();
		System.out.println("Enter 2nd no:");
		b = scan.nextInt();
		System.out.println("Multiplication of 2 no:" + (a * b));

	}

	public static void main(String[] args) {
		Thread obj = new Thread(new RunnableIm());
		obj.start();
	}

}
