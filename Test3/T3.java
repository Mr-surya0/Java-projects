package com.Test3;

public class T3 {
	
	public static void main(String[] args) {
		//to find the largest number in an array without using built-in functions
		int nums[]= {2,3,4,5};
	    int largest = Integer.MIN_VALUE;
	    for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > largest) {
	    largest = nums[i];
	    }
	    }
	    System.out.println("The largest number is: " + largest);

	}

}
