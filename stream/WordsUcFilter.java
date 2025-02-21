package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Fil{
	int n;

	public Fil(int n) {
		this.n = n;
	}
	int addition() {
		return n+5;
	}
}


	public class WordsUcFilter {
	    public static void main(String[] args) {
	        List<Integer> obj = Arrays.asList(3, 4, 5, 7, 12, 10);
	        List<Integer> i = obj.stream()
	                .map(Fil::new)
	                .filter(f -> f.addition() > 10) 
	                .map(Fil::addition)
	                .collect(Collectors.toList());
	        System.out.println(i);
	    }
	}