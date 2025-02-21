package com.test;

public class Parameter {
	int cube(final int n) {
		return n * n * n;
	}

	public static void main(String[] args) {
		Parameter obj = new Parameter();
		System.out.println(obj.cube(5));
		
	}

}
