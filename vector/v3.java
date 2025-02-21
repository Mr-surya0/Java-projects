package com.vector;

import java.util.Iterator;
import java.util.Vector;

public class v3 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("apple");
		v.add("Orange");
		v.add("Mangoo");
		v.add("Banana");
		System.out.println(".....For loop.......");
		for (int  i=0;i<v.size();i++) {
			System.out.println(v);
		}
		
		System.out.println(".....For Each Loop....:\n");
		for (String St : v)

		{
			System.out.println(St);
		}
		System.out.println("........Iterator Interface.........");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("....For Each Method.....\n");
		v.forEach(s -> System.out.println(s));
	}

}
