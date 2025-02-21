package com.Stringbuilder;

public class StringBuilderEnsureCapacity {

	public static void main(String[] args) {
		// StringBuilder class ensures that the given capacity is the minimum to the
		// current capacity
		// If it is greater than the current capacity, it increases
		StringBuilder se = new StringBuilder();
		se.append('s');
		System.out.println(se.capacity());
		se.append("Hii nice to meet you ");
		System.out.println(se.capacity());
		se.ensureCapacity(17);// no change
		System.out.println(se.capacity());
		se.ensureCapacity(50);
		System.out.println(se.capacity());// the change will reflect here

	}

}
