package com.Stringbuilder;

public class StringBuilderInsert {

	public static void main(String[] args) {
// method inserts the given string with this string at the given position.
		StringBuilder sb = new StringBuilder(" a nice day");
		sb.insert(0, 2);
		System.out.println(sb);
	}

}
