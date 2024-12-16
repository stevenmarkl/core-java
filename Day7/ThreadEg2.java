package com.Day7;

class MyThread2 extends Thread {

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
public class ThreadEg2 {

	public static void main(String[] args) throws InterruptedException{
		MyThread2 t3 = new MyThread2();
		t3.setName("T3");
		t3.start();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
		
		}
		t3.join();
		System.out.println("Main End");
		
		

	}

}
