package com.forEachm;

import java.util.Hashtable;

public class hashtableFE {

	public static void main(String[] args) {
Hashtable <String,Integer> ht=new Hashtable<String,Integer>();
ht.put("a",3);
ht.put("b",2);
ht.put("c",1);
ht.forEach((k,v)->{System.out.println(k+" "+v);});
	}

}
