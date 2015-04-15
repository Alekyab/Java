/**
 * 
 */
package com.cloudwick.training.patterns;

/**
 * @author alekya
 *
 */
public class PrototypeManager {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeUserClone uc = new PrototypeUserClone();
		uc.setssn(1234);
		
		PrototypeUserClone uc2 = (PrototypeUserClone) uc.clone();
		System.out.println(uc2.getssn());
		
	}

}
