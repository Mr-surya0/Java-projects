package com.Stringbuilder;

public class StringBuilderCapacity {

	public static void main(String[] args) {
		// method returns the current capacity of string(oldcapacity*2)+2   
	StringBuilder sb=new StringBuilder();
	System.out.println(sb.capacity());
	sb.append("Hello");
	System.out.println(sb.capacity());
	sb.append("Welome to the world of java ");
	System.out.println(sb.capacity());

	}

}
