package com.Test2;

public class T5 {
	public static void main(String[] args) {
		int num[]= {-1,3,2,4,2,1};
		int product =1;
		int i=0;
		while(i < num.length) {
			product *= num[i];
			i++;
		}
		System.out.println("product of real numbers is "+product);
	}

}
