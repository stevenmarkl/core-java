package com.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEg {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Java");
		map.put(20, "Python");
		map.put(30, "c");
		map.put(40, "c++");
		map.put(null, null);
		System.out.println(map);

		map.put(40, "mark");
		System.out.println(map);

		map.remove(40, "mark");
		System.out.println(map);

		System.out.println(map.get(20));
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(20));
		System.out.println(map.containsValue("c"));

		// way 1
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + "--" + map.get(key));
		}

		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "=>" + map.get(key));
		}

		// way 2
		Set<Entry<Integer, String>> entries = map.entrySet();
		System.out.println(entries);
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		Iterator<Entry<Integer, String>> it1 = entries.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> entry = it1.next();
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
	}

}
