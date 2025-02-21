package com.vector;

import java.util.Vector;

public class v1 {
//multithreaded environment so increase performance
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Welcome To Java :\n");
		v.add(" Welcome To YaaleTechnoligies:\n");
		v.add("Welcomes You :\n");
		v.add(" Hello World...:\n");
		v.add("Time To Start Java Class:\n");
		System.out.println(v);

		Vector<Integer> in = new Vector<Integer>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		System.out.println(in);
		
		
		Vector<String> str = new Vector<String>();
		str.add("Welcome To Java :\n");
		str.add("Welcome To Yaale :\n");
		str.add("Welcomes You :\n");
		str.add("Hello World :\n");
		System.out.println(str);
	}

}
