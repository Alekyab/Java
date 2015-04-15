/**
 * 
 */
package com.cloudwick.training.core.io;

import java.io.Serializable;

/**
 * @author alekya
 *
 */
public class UserSerialize implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int ssn;
	private  String name;

	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
