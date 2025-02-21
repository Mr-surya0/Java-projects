package com.Test2;

public class T12 {

	public static void main(String[] args) {
//find the sum of the digits of an integer using a while loop
		int digit[]= {2,3,4,5};
		int sum = 0;
		int i = 0;
		
		while (i<digit.length) {
			sum += digit[i];
		i++;	
		}
		System.out.println("sum of digit "+sum);
	} 

}
