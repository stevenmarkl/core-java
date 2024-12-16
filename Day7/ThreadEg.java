package com.Day7;

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "is running");
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {

			}

		}

	}
}

public class ThreadEg {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();

		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {

		}

		System.out.println(t1.getState());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println("MAIN END");

	}

}
