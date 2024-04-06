package org.mindhub.threads3;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {

	private final Messenger messenger;

	public Consumer(Messenger messenger) {
		this.messenger = messenger;
	}

	@Override
	public void run() {
		String message = "";
		while (!message.equals("BYE")) {
			message = messenger.getMessage();
			System.out.println("Received message: " + message);
			try {
				Thread.sleep(ThreadLocalRandom.current().nextLong(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
