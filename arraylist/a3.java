package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class a3 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("apple");
		ar.add("Orange");
		ar.add("Mangoo");
		ar.add("Banana");

		// For Loop
		System.out.println(".......for loop.....");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar);
		}
		System.out.println(".....For Each Loop....:\n");
		for (String St : ar)

		{
			System.out.println(St);
		}
		// iterator
		System.out.println("...iterator...");
		Iterator<String> itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("....For Each Method.....\n");
		ar.forEach(s -> System.out.println(s));
	}

}
