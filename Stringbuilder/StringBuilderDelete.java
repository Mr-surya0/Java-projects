package com.Stringbuilder;

public class StringBuilderDelete {

	public static void main(String[] args) {
		// this method used to delete
		StringBuilder sb = new StringBuilder("Hello");
		sb.delete(1, 3);
		System.out.println(sb);
	}

}
