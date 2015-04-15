/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class FactoryUserFactory {

	public static FactoryUserI getObject(int type)
	{
		FactoryUserI obj =null;
		if(type==1)
			obj=new FactoryAdminUser();
		else
			obj=new FactorySuperUser();
		return obj;
		
	}
}
