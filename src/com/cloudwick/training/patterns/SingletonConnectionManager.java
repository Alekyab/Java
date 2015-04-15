/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class SingletonConnectionManager {
	private static SingletonConnectionManager obj;
	public String name;
	private SingletonConnectionManager() {

	}

	public static synchronized SingletonConnectionManager getObject() {
		if (obj == null) {
			obj = new SingletonConnectionManager();
		}
		return obj;
	}

}
