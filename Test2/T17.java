package com.Test2;

import java.util.Scanner;

public class T17 {

	public static double calculateDiscriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	// Function to find and display the roots of the quadratic equation
	public static void findRoots(double a, double b, double c) {
		double discriminant = calculateDiscriminant(a, b, c);

		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Roots are real and different.");
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.println("Roots are real and equal.");
			System.out.println("Root: " + root);
		} else {

			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
			System.out.println("Roots are complex and different.");
			System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
			System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter coefficient a: ");
		double a = scanner.nextDouble();
		System.out.print("Enter coefficient b: ");
		double b = scanner.nextDouble();
		System.out.print("Enter coefficient c: ");
		double c = scanner.nextDouble();

		findRoots(a, b, c);

		scanner.close();
	}
}
