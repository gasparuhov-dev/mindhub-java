package org.mindhub.threads2;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private AtomicInteger count = new AtomicInteger();
//	private Integer count = new Integer(0);
//	private MyInteger count = new MyInteger();
	private Object lock = new Object();
	private Object lock2 = new Object();

	public void increment() {
//		int increment;
//		increment = ThreadLocalRandom.current().nextInt(10);
//		synchronized (count) {
//			count += increment;
//			count++;
//			count.setValue(count.getValue() + 1);
//		}
		count.incrementAndGet();
	}

	public void increment2() {
//		synchronized (count) {
//			count++;
////			count.setValue(count.getValue() + 1);
//		}
		count.incrementAndGet();
	}

	public int getCount() {
//		return count.getValue();
		return count.get();
	}

}
