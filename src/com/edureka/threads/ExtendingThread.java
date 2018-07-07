package com.edureka.threads;

public class ExtendingThread extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		ExtendingThread thread = new ExtendingThread();
		thread.setName("Child Thread");
		thread.start();
		
		for(int i = 0; i < 10; i++) {
			Thread.sleep(2000);
		 System.out.println("Printed from the main thread "+Thread.currentThread().getName());
		}

	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing from the child thread "+i+Thread.currentThread().getName());
		}
	}

}
