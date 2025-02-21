package com.ScannerOperator;
import java.util.Scanner;
public class InstanceOfOperator {

	public static void main(String[] args) {

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		Integer b;
		b = scan.nextInt(); 
				
		if(b instanceof Integer)
		{
			System.out.println("Its True");
		}
		
		else
		{
			System.out.println("Its False");
		}
	}

}
