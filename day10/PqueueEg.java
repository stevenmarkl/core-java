package com.day10;

import java.util.PriorityQueue;

public class PqueueEg {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		pqueue.offer(20);
		pqueue.offer(30);
		pqueue.offer(10);
		pqueue.offer(70);
		System.out.println(pqueue);
		}

}
