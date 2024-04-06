package org.mindhub.threads3;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {

	private final Messenger messenger;

	public Producer(Messenger messenger) {
		this.messenger = messenger;
	}

	@Override
	public void run() {
		List<String> messages = List.of("Hello!", "Can you hear me?",
				"I'm in California dreaming about who we used to be", "When we were younger and free",
				"I've forgotten how it felt before the world fell at our feet", "BYE");

		messages.forEach(message -> {
			messenger.sendMessage(message);
			try {
				Thread.sleep(ThreadLocalRandom.current().nextLong(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

	}

}
