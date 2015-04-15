/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class DecoratorManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecoratorCloudwickGeneralUser obj = new DecoratorCloudwickGeneralUser();
		DecoratorCloudwickAdminUser obj2 = new DecoratorCloudwickAdminUser();
		
		obj.authenticate();
		obj2.authenticate();

	}

}
