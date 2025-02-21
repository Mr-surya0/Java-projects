package com.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RuntimeucFilter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the words separate with spaces");
		String f=s.nextLine();
		String[] out=f.split(" ");
		
		List<String> obj=new ArrayList<>(Arrays.asList(out));
		List<Integer> result = obj.stream()
				.map(String::length)
				.filter(len->
				{
				System.out.println("Length:"+len);
				return len>=0;
				}).collect(Collectors.toList());
		System.out.println(result);
	}

}
