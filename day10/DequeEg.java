package com.day10;

import java.util.Deque;
import java.util.LinkedList;

public class DequeEg  {
	
	public static void main(String[] args) {
		Deque <Integer>dequeue = new LinkedList<>();
		
		dequeue.offer(10);
		dequeue.offer(20);
		dequeue.offer(30);
		dequeue.offer(40);
		dequeue.offer(50);
		
		dequeue.offerFirst(100);
		dequeue.offerLast(90);
		
		System.out.println(dequeue);
		
		dequeue.poll();
		dequeue.pollFirst();
		dequeue.pollLast();
		System.out.println(dequeue);
		

	}

}



