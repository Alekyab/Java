/**
 * 
 */
package com.cloudwick.training.core.user;

/**
 * @author alekya
 *
 */
public class AdminUser extends UserManager {

	public void printData()
	{
		System.out.println("Print the data");
	}
	
	public int calculate(int num1, int num2, String type)
	{
		return num1*num2;
	}
}
