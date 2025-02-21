package com.Stringbuilder;

public class StirngBuilderReplace {

	public static void main(String[] args) {
// replaces the given string from the specified beginIndex and endIndex.
		StringBuilder se = new StringBuilder("gollo world");
		se.replace(0, 2, "he");
		System.out.println(se);
	}
}
