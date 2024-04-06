package org.mindhub.threads3;

public class Messenger {

	private String message;
	private boolean available = false;

	public synchronized void sendMessage(String message) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.message = message;
		changeFlag(true);
		notifyAll();
	}

	public synchronized String getMessage() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		changeFlag(false);
		notifyAll();
		return message;
	}

	private synchronized void changeFlag(boolean flag) {
		available = flag;
	}

}
