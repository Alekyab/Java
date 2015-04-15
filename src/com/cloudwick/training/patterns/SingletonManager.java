/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class SingletonManager {

	public static void main(String[] args) {
		SingletonConnectionManager.getObject().name="Fremont";
		System.out.println(SingletonConnectionManager.getObject().name);
	}
}
