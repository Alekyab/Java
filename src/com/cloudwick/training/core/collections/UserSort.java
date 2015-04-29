/**
 * 
 */
package com.cloudwick.training.core.collections;

/**
 * @author alekya
 *
 */
public class UserSort implements Comparable<UserSort> {

	public int ssn;
	public String name;

	public UserSort(int ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	public String toString() {
		return ssn + " " + name;
	}

	public int compareTo(UserSort o) {
		// return this.ssn - o.ssn;
	//	return o.ssn - this.ssn;
	//	return (this.name).compareTo(o.name);
	return (o.name).compareTo(this.name);
	}

}
