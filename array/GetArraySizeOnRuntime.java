package com.array;

import java.util.Scanner;

public class GetArraySizeOnRuntime {

	public static void main(String[] args) {
		// how to pass the array size at runtime
		Scanner scan=new Scanner(System.in);

		System.out.println("enter the size of the array");
		
		int b=scan.nextInt();
		int a[]=new int[b];
		System.out.println("enter the "+b+ " numbers");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		
		
	}

}
