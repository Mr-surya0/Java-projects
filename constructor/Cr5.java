package com.constructor;

public class Cr5 {
           private Cr5() {
        	   System.out.println("this is private constructor");
           }
	public static void main(String[] args) {
		// Constructor can be private
        new Cr5();
	}

}
