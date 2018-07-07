package com.edureka.concurrency.sync;

public class PrinterJob implements Runnable {

	private Printer printer;
	
	public PrinterJob(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.print();
		
	}
}
