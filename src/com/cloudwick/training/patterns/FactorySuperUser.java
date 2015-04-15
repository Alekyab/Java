/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class FactorySuperUser implements FactoryUserI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloudwick.training.patterns.UserI#getDetails()
	 */
	
	@Override
	public void getDetails() {
		System.out.println("Super user class called!!");
	}

}
