/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class FactoryClient {

	public static void main(String[] args) {
		FactoryUserI obj = FactoryUserFactory.getObject(2);// client doesnt have direct
												// contact with adminuser and
												// superuser. we are going
												// through user factory class
//if(obj instanceof AdminUser)
	obj.getDetails();
	}
}
