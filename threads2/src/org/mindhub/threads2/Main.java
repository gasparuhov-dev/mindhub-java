package org.mindhub.threads2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();
		List<Thread> threads = new ArrayList<>();
		List<Object> list = Collections.synchronizedList(new ArrayList<>());

		Runnable run = () -> list.add(new Object());

		for (int i = 0; i < 10_000; i++) {
//			Thread t = new Thread(new Incrementer(c));
//			threads.add(t);
//			t.start();
			Thread t = new Thread(run);
			threads.add(t);
			t.start();
		}

		for (Thread t : threads) {
			t.join();
		}

//		Thread.sleep(10000);

//		System.out.println("Count: " + c.getCount());
		System.out.println("Size: " + list.size());
	}

}
