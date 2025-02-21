package com.forEachm;

import java.util.HashMap;
import java.util.Map;

public class hashmapFE {

	public static void main(String[] args) {
  Map<Integer,String> obj=new HashMap <Integer,String>();
  obj.put(1, "monkey");
  obj.put(2, "donkey"); 
  obj.put(3, "jokey");
  obj.forEach((k,v)->{System.out.println(k+" "+ v);});
  
	}

}
