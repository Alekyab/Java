/**
 * 
 */
package com.cloudwick.training.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author alekya
 *
 */


public class Calculator {

	/**
	 * @param args
	 */
	
	final static Logger logger = Logger.getLogger(Calculator.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("Log4j_cloudwick.properties"); 
		
calculate(-1,2);
	}
	
	@SuppressWarnings("unused")
	private static int calculate(int num1, int num2)
	{
		logger.debug("Calculate method called with "+ num1+ " + "+num2);
		if(num1<0)
		{
			logger.error("please provide positive number");
			
		}
		return num1+num2;
	}

}
