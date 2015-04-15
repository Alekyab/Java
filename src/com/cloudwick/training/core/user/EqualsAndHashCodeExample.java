/**
 * 
 */
package com.cloudwick.training.core.user;

/**
 * @author alekya
 *
 */
public class EqualsAndHashCodeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj = new Address();
		obj.setAge(24);
		obj.setFirstName("Alekya");
	
		Address obj2 = new Address();
		obj2.setAge(24);
		obj2.setFirstName("Alekya");
		
		System.out.println(obj.getFirstName() + " "+ obj.getAge());
		
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		if(obj==obj2)
		{
			//System.out.println("true");
		}
		if(obj.equals(obj2))
	System.out.println("equal");
	}

}
