/**
 * 
 */
package com.cloudwick.training.core.collections;

import java.util.Comparator;

/**
 * @author alekya
 *
 */
public class UserComparator implements Comparator<UserSort> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(UserSort arg0, UserSort arg1) {
		return arg0.ssn-arg1.ssn;
	}
	
	

}
