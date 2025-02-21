package com.Interface;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
HashSet obj=new HashSet();
obj.add("baby");
obj.add(2);
obj.add(null);
obj.add('d');
System.out.println(obj);

//second way to create
Set obj1=new HashSet();
obj1.add(1);
obj1.add("murugan");
	System.out.println(obj1);
	
//third type
	
HashSet<Integer> ob=new HashSet<Integer>();
ob.add(1);
ob.add(3);
ob.add(5);
System.out.println(ob);

//set method
obj.contains("baby");
obj.size();
obj.isEmpty();
obj.remove(2);
System.out.println(obj);
obj.clear();
System.out.println(obj);

	}

}
