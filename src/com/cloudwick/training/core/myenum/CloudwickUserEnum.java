/**
 * 
 */
package com.cloudwick.training.core.myenum;

/**
 * @author alekya
 *
 */
public enum CloudwickUserEnum {

	Admin(24, "Read", "CA"), General(21, "Write", "TX"), Super(21, "Write",
			"UT");

	private int userId;
	private String access;
	private String state;

	
	private CloudwickUserEnum(int userId, String access, String state) {
		this.userId = userId;
		this.state = state;
		this.access = access;
	}
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @return the access
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	public void calculateTaxes()
	{
		System.out.println("Calculating the state Taxes for "+ this.state);
	}

}
