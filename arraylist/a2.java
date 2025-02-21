package com.arraylist;

import java.util.ArrayList;

public class a2 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("apple");
		ar.add("Orange");
		ar.add("Banana");
		ar.add("grapes");
		System.out.println(ar);
		System.out.println(ar.isEmpty());
		System.out.println(ar.size());
		System.out.println("........ Contanis Apple.....:\n");
		System.out.println(ar.contains("apple"));
		System.out.println(ar.remove("grapes"));
		System.out.println("........After Removeal........");
		System.out.println(ar);
	}

}
