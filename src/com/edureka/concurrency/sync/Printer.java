package com.edureka.concurrency.sync;
/**
 * This is a common resource used for all the developers in the team
 * @author prade
 *
 */
public class Printer {
	public synchronized void print() {
		for(int i = 0;i < 5; i++) {
			System.out.println("Printing... " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
