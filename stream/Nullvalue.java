package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nullvalue {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("hai", null, "and", null, "bye"));
		System.out.println("Initial List: " + list);
		list = list.stream().filter(x -> x != null).collect(Collectors.toList());
		System.out.println("Modified List: " + list);
	}
}