package com.constructor;

public class Cr3 {
Cr3(){
	System.out.println("Constructor is there");
}
	public static void main(String[] args) {
		// the constructor won't create the new constructor if a constructor is there
new Cr3();
	}

}
