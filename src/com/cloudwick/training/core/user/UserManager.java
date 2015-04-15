package com.cloudwick.training.core.user;

public  class UserManager extends UserAbstract implements UserI{

	public String firstName;
	private int ssn;
	protected int age;
	public static final String state ="CA";

	public UserManager() {

super();
	}
	
	public int calculate(int num1, int num2, String type)
	{
	return num1-num2;	
	}
	/**
	 * 
	 * 
	 @param name
	 *            - sets the first name
	 */
	public void setName(String name) {
		this.firstName = name;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
	
	public String toString()
	{
		 return super.toString();
	}

	/* (non-Javadoc)
	 * @see com.cloudwick.training.core.user.UserI#getSSN()
	 */
	@Override
	public int getSsn() {
		// TODO Auto-generated method stub
		return 24;
		
	}

	
	/* (non-Javadoc)
	 * @see com.cloudwick.training.core.user.UserAbstract#getState()
	 */
	public int getState() {
		// TODO Auto-generated method stub
		return 30;
	}
	@Override
	public void printResult()
	{
	super.printResult();
	System.out.println("Bachala");
	}
}
