package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> obj = new HashMap<String, Integer>();
		obj.put("kanyaumari", 44);
		obj.put("Thanjavur", 5);
		obj.put("Madurai", 6);

		HashMap<String, Integer> obj2 = new HashMap<String, Integer>();
		obj2.put("kanjipuram", 1);
		obj2.put("mahaballiburam", 2);

		obj.putAll(obj2);

		System.out.println(obj);
		System.out.println(obj.containsKey("Kanyaumari"));
		System.out.println(obj.containsValue(6));
		System.out.println();
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println("''''''''''''After remove'''''''''''''''");
		System.out.println(obj.remove("Madurai" + obj));

		Map<Integer, String> obj1 = new HashMap<Integer, String>();
		obj1.put(1, "Man");
		obj1.put(2, "Women");

		obj.clear();
		System.out.println("After clear" + obj);

		Hashtable<Integer, String> ob = new Hashtable<Integer, String>();
		ob.put(1, "Emotion");
		ob.put(2, "Anger");
		ob.put(3, "sad");

		System.out.println(ob);
	}

}
