/**
 * 
 */
package com.cluodwick.training.core.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alekya
 *
 */
public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		
		List<Thread> threads = new ArrayList<Thread>();
		Thread t1;
		for (int i = 0; i < 500; i++) {
			t1= new UserThread(10 + i);
			threads.add(t1);
			t1.start();
		}
		int running = 0;
		do {
			running=0;
			for (Thread t : threads) {
				
				if (t.isAlive())
					running++;
				
			}
			
		} while (running != 0);
		Thread.sleep(5000);
		System.out.println("All work done");

		/*
		 * for(int i=0;i<500;i++) { t1= new UserThread(100000+i);
		 * t1.setName("cloudwick"+i); if(i>100 && i<200) t1.setPriority(10);
		 * System.out.println(t1.getState()); t1.start();
		 * System.out.println(t1.getState()); //t1.sleep(50000);
		 * System.out.println(t1.getState());
		 * 
		 * }
		 */

		//System.out.println("All work done");
	}
}