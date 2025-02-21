package com.Test2;
import java.util.Scanner;

public class T16 {

	
		   
		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		    // Function to generate and display prime numbers from 1 to N
		    public static void generatePrimesUpToN(int N) {
		        System.out.println("Prime numbers from 1 to " + N + ":");
		        for (int i = 2; i <= N; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println(); 
		    }

		    public static void main(String[] args) {
		  
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the value of N: ");

		        int N = scanner.nextInt();
		        generatePrimesUpToN(N);

		        scanner.close();
		    }
		}
