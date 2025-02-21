package com.exception;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
		int a[] = { 0, 0 };
		int n = 10;
		try {
			System.out.println(n / a[2]);
		} catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Bye");
		}

	}

}
