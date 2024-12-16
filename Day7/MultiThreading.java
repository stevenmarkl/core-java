package com.Day7;

public class MultiThreading {
	
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("My thread is running");
			try {
				Thread.sleep(3000);
				
			}
			catch(InterruptedException e) {
				
			}
			
		}

	}

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.getState());
		
		
	}

}
