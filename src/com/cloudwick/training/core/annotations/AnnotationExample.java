/**
 * 
 */
package com.cloudwick.training.core.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author alekya
 *
 */
public class AnnotationExample {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		UserAnnotation obj = new UserAnnotation();
	Method[] methods=obj.getClass().getMethods();
	
	for(Method m : methods)
	{
		
		if(m.getAnnotation(LogMessage.class)!=null)
		{
			String name =m.getName();
			if(name.equals("printData"))
			m.invoke(obj);
			if(name.equals("calculate"))
			System.out.println(m.invoke(obj, 23,24));
		}
		}
	}

}
