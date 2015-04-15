/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class FactoryAdminUser implements FactoryUserI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloudwick.training.patterns.UserI#getDetails()
	 */
	@Override
	public void getDetails() {
		System.out.println("Admin user called!!!");
	}

}
