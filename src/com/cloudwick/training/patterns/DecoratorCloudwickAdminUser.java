/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class DecoratorCloudwickAdminUser extends DecoratorCloudwickGeneralUser {

	public void authenticate()
	{
		super.authenticate();
		System.out.println("Allowed role 2");
	}
}
