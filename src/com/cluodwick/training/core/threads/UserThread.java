/**
 * 
 */
package com.cluodwick.training.core.threads;

/**
 * @author alekya
 *
 */
public class UserThread extends Thread {

	private int num;

	public UserThread(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= num; i++)
			sum = sum + i;

		System.out.println(sum+ " "+ Thread.currentThread());
	}

}
