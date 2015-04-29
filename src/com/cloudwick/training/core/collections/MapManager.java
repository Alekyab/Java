/**
 * 
 */
package com.cloudwick.training.core.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author alekya
 *
 */
public class MapManager {
	static HashMap<Integer, String> hMap = new HashMap<Integer, String>(20);

	public static void main(String[] args) {

		populateMap();
		getKeys();
		getByEntry();
	}

	private static void populateMap() {
		hMap.put(11, "F");
		hMap.put(12, "M");
		hMap.put(13, "F");
		hMap.put(12, "F");
	}

	private static void getKeys() {
		Set<Integer> set = hMap.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int j = it.next();
			// it.remove();
			System.out.println("Key " + j);
			System.out.println("Value " + hMap.get(j));
		}
	}

	private static void getByEntry() {
		Set<Entry<Integer, String>> entries = hMap.entrySet();

		Iterator<Entry<Integer, String>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> j = itr.next();
			System.out.println("Key " + j.getKey());
			System.out.println("Value " + j.getValue());
		}

	}
}
