/**
 * 
 */
package com.cloudwick.training.core.user;

/**
 * @author alekya
 *
 */
public class Address {

	private int age ;
	private String firstName;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/** Mutators
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/** Accessors
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Address))
			return false;
		if (this.firstName==( (Address)obj).firstName)
			return true;
		else
			return false;
		
		
	}
	
	@Override
	public int hashCode()
	{
		int hash =34;
		hash+=this.getAge();
		hash+=((this.firstName==null))?0:this.firstName.hashCode();
		return hash;
	}
}
