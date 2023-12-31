package org.mindhub.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueMain {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("First");
		queue.add("Second");
		queue.add("Third");
		queue.remove();
		
//		while(!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}
		
		ArrayDeque<String> deque = new ArrayDeque<>();
		
		deque.add("Second");
		deque.addLast("Third");
		deque.addFirst("First");
		deque.addFirst("Zero");
		
		while(!deque.isEmpty()) {
			System.out.println(deque.remove());
		}

	}

}
