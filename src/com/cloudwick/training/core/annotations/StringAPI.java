/**
 * 
 */
package com.cloudwick.training.core.annotations;

import java.util.StringTokenizer;

/**
 * @author alekya
 *
 */
public class StringAPI {
	
	public static void main(String[] args) {
		String text= "CA TX fs ln CA";
		System.out.println(text.replace("CA","TX"));
		System.out.println(text.toUpperCase());
		
		char[] chr = text.toCharArray();
		for(char c: chr)
			System.out.println(c);
	
		byte[] b = text.getBytes();
		for(byte byt :b)
			System.out.print(byt +" ");
		
		System.out.println(text.indexOf("CA"));
		System.out.println(text.lastIndexOf("CA"));
		System.out.println(text.substring(10, 14));
		
		StringTokenizer t = new StringTokenizer(text, " ");
		while(t.hasMoreTokens())
		{
			System.out.println(t.nextToken());
		}
	}
	
	

/**
 * 
 */


}
