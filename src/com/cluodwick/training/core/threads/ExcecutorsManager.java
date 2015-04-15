/**
 * 
 */
package com.cluodwick.training.core.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author alekya
 *
 */
public class ExcecutorsManager {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10); // At a
																	// given
																	// time only
																	// 10
																	// threads
																	// will be
																	// running.....

		for (int i = 0; i < 2000; i++) {
			UserThread t = new UserThread(10 + i);
			service.execute(t);
		}
		// Executors.newScheduledThreadPool(corePoolSize) -----------Timer
		// basedoperations
		service.shutdown();

		do {

		} while (!service.isTerminated());
		System.out.println("All Work done");

	}

}
