package com.exception;

import java.util.Scanner;

class NotEligibleException extends Exception
{
	public NotEligibleException(String msg)
	{
		super(msg);
	}
}

class Register {
    public static void checkAge(int age) throws NotEligibleException 
    {
        if (age < 18) 
        {
            throw new NotEligibleException("Not eligible");
        }
    }
}

public class ExceptionHandling3 
{

    public static void main(String[] args)
    {
        // user-defined exception
        int age = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter candidate age");
        age = scan.nextInt();
        try {
            Register.checkAge(age);
            System.out.println("Registration completed");
        } catch (NotEligibleException obj)
        {
            System.out.println(obj.getMessage());
        }
    }
}
