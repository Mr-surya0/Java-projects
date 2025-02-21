package com.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetriveElementsHashTable {

	public static void main(String[] args) {
		Map<Integer, String> obj = new Hashtable<>();
		obj.put(101, "apple");
		obj.put(201, "orange");
		obj.put(301, "grape");

		// 1 way to retrieve foreach loop
		Set<Integer> s = obj.keySet();
		for (Integer k : s) {
			System.out.println(k + "\t" + obj.get(k));
		}
		System.out.println("------------------------------");

		// 2 way iterator
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + "\t" + obj.get(key));
		}
		System.out.println("------------------------------");

		// 3 way foreach()
		obj.forEach((k, value) -> System.out.println(k + "\t" + value));

		System.out.println("------------------------------");

		// 4 foreach entry set
		Set<Map.Entry<Integer, String>> obj1 = obj.entrySet();
		for (Map.Entry<Integer, String> entry : obj1) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "\t" + value);
		}

		// 5 entry set in iterator
		System.out.println("------------------------------");
		Iterator<Entry<Integer, String>> itr1 = obj1.iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> entry = itr1.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "\t" + value);
		}

	}
}
