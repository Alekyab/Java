/**
 * 
 */
package com.cloudwick.training.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author alekya
 *
 */
public class SortingManager {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List aList = new ArrayList();
		aList.add(5);
		aList.add(10);
		aList.add(8);
		aList.add(20);
		aList.add(3);

		printResult(aList);
		Collections.sort(aList);
		System.out.println("\nAfter Sorting.....");
		printResult(aList);

		List userList = new ArrayList();
		userList.add(new UserSort(1, "alekya"));
		userList.add(new UserSort(12, "reddy"));
		userList.add(new UserSort(10, "bachala"));
		userList.add(new UserSort(8, "chinni"));
		//Collections.sort(userList);
		Collections.sort(userList, new UserComparator());
		printResult(userList);
	}

	@SuppressWarnings("rawtypes")
	private static void printResult(List aList) {
		Iterator itr1 = aList.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
