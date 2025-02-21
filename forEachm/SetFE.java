package com.forEachm;

import java.util.HashSet;
import java.util.Set;

public class SetFE {

	public static void main(String[] args) {
 Set<Integer> obj=new HashSet<>();
 obj.add(1);
 obj.add(2);
 obj.add(3);
 obj.forEach((k)->{System.out.println(k);}); 
	}

}
