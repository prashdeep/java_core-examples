package com.edureka.concurrency.threads;

public class RunnableDemo {

	public static void main(String[] args) {

		Thread childThread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("The name of the child thread is " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		childThread.start();
		System.out.println("This is the main thread....");
	}

}
