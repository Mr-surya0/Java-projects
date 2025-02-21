package com.Test4;

import java.util.*;

public class SwitchCaseMenuDriven {

	public static void main(String a[]) {

		int number1 = 0, number2 = 0, option = 0;
		while (true) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Input your choice from the following menu:");
				System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
				option = sc.nextInt();
				if (option != 5) {
					System.out.println("Input the first number");
					number1 = sc.nextInt();
					System.out.println("Input the second number");
					number2 = sc.nextInt();
				}
				switch (option) {
				case 1:
					System.out.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
					break;
				case 2:
					System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
					break;
				case 3:
					System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
					break;
				case 4:
					if (number2 == 0)
						System.out.println("Error In division the denominator cannot be 0!");
					else {
						System.out.println("The division of " + number1 + " by " + number2 + " quotient is "
								+ (number1 / number2) + " and remainder is " + (number1 % number2));
					}
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid choice");
				}
			
		}
	}
}
