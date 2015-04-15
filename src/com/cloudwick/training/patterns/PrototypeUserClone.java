/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class PrototypeUserClone implements Cloneable{

	private int ssn;
	
	public int getssn()
	{
		return this.ssn;
	}
	
	public void setssn(int ssn)
	{
		this.ssn =ssn;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
