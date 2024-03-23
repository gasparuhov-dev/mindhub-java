package org.mindhub.threads2;

public class Incrementer implements Runnable {

	private final Counter counter;

	public Incrementer(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			if (i % 2 == 0) {
				counter.increment();
			} else {
				counter.increment2();
			}
		}
	}

}
