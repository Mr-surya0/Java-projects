package com.Test2;

public class T14 {
	    // Function to calculate the sum of digits for a given number
	    public static int sumOfDigits(int number) {
	        int sum = 0;
	        while (number != 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        return sum;
	    }

	    public static void displayIntegersWithEvenSumOfDigits() {
	        for (int i = 100; i <= 150; i++) {
	            if (sumOfDigits(i) % 2 != 0) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        displayIntegersWithEvenSumOfDigits();
	    }
	}
