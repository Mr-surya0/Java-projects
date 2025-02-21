package com.thread;

import java.util.Scanner;

public class ExtendsThread extends Thread {
	Scanner scan = new Scanner(System.in);

	public void run() {
		int a, b;
		System.out.println("Enter 1st no:");
		a = scan.nextInt();
		System.out.println("Enter 1st no:");
		b = scan.nextInt();
		System.out.println("Addition of 2 No");
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		ExtendsThread obj = new ExtendsThread();
		obj.start();
	}

}
