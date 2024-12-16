package com.Day7;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+ "is running");
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {

			}
		}

	}
 }

public class OwnMultiThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
		

	}

}
