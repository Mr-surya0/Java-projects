package com.vector;

import java.util.Vector;

public class v2 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("apple");
		v.add("Orange");
		v.add("Banana");
		v.add("grapes");
		System.out.println(v);
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println("........ Contanis Apple.....:\n");
		System.out.println(v.contains("apple"));
		System.out.println(v.remove("Banana"));
		System.out.println("........After Removeal........");
		System.out.println(v);
		
	}

}
