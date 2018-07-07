package com.edureka.concurrency;

public class PrinterJob implements Runnable {

	private Printer printer;

	public PrinterJob(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		System.out.println("Printing the job for thread " + Thread.currentThread().getName());
		synchronized (printer) {
			printer.print(Thread.currentThread().getName());
			
		}
	}

}
