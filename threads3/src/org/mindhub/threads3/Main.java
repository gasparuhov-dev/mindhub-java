package org.mindhub.threads3;

public class Main {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		Thread producer = new Thread(new Producer(messenger));
		producer.setName("Producer");
		Thread consumer = new Thread(new Consumer(messenger));
		consumer.setName("Consumer");

		producer.start();
		consumer.start();
	}

}
