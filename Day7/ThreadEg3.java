package com.Day7;
class TwoTables implements Runnable{

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * 2 = " + (i*2));
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

			}

		}

	}
}

class FiveTables extends Thread{

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 5 = " + (i*5));
			try {
				Thread.sleep(3000);

			} catch (InterruptedException e) {

			}

		}

	}
}

public class ThreadEg3 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new TwoTables());
		t1.setName("Two");
		t1.start();
		t1.join();
	
		FiveTables t2 = new FiveTables();
		t2.setName("Five");
		t2.start();

	}

}
