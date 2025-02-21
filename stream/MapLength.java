package com.stream;

import java.util.Arrays;
import java.util.List;

public class MapLength {

	public static void main(String[] args) {
     List<String> obj=Arrays.asList("car","bus","lorry","toyato");
     
     obj.stream().map(x->x.length()).forEach(y-> System.out.println("Length of the list :"+y));	
     
   List<Integer> ob=Arrays.asList(5,6,7,7,8,9);
     ob.stream().map(x->x*2).forEach(y-> System.out.println(y));	
	}
}
