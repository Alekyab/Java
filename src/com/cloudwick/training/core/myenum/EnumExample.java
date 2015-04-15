/**
 * 
 */
package com.cloudwick.training.core.myenum;

/**
 * @author alekya
 *
 */
public class EnumExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tight coupling fashion
		System.out.println("Accessing in coupled approach....\n");
		
		System.out.println(CloudwickUserEnum.Admin.getAccess());
		System.out.println(CloudwickUserEnum.Admin.getState());
		System.out.println(CloudwickUserEnum.Admin.getUserId());
		CloudwickUserEnum.Admin.calculateTaxes();
		
		System.out.println("\nAccessing in decoupled fashion .........\n");
		//decoupled fashion
		for(CloudwickUserEnum e : CloudwickUserEnum.values())
		{
			System.out.println(e.getAccess());
		}
	}

}
