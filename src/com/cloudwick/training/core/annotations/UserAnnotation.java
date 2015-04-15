/**
 * 
 */
package com.cloudwick.training.core.annotations;

/**
 * @author alekya
 *
 */
public class UserAnnotation {

	public void printResult() {
		System.out.println("Invoked Print Result Method ");
	}
	

	
	@LogMessage
	public void printData() {
		System.out.println("Invoked Print Data Method ");
	}
	@LogMessage
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}
