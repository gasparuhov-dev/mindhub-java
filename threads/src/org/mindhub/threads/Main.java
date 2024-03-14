package org.mindhub.threads;

public class Main {

	public static class Worker implements Runnable {
		Thread previous;

		@Override
		public void run() {
			int counter = 0;
			while (counter < 5) {
				for (int i = 0; i < 10_000; i++) {
					System.out.println("Thread: " + Thread.currentThread().getName() + " prints: " + i);
				}
				System.out.println(Thread.currentThread().getName());
				counter++;
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

//		Thread t = new Thread(new Worker());
//		t.setDaemon(false);
//		t.start();

//		Thread t = new Thread() {
//			@Override
//			public void start() {
//				for (int i = 0; i < 10_000; i++) {
//					System.out.println("Thread: " + Thread.currentThread().getName() + " prints: " + i);
//				}
//				System.out.println(Thread.currentThread().getName());
//			}
//		};

		Thread t = new Thread(() -> {
			for (int i = 0; i < 10_000; i++) {
				System.out.println("Thread: " + Thread.currentThread().getName() + " prints: " + i);
			}
			System.out.println(Thread.currentThread().getName());
		});
		t.setName("Our thread");

		t.start();

//		t.join();

		System.out.println(Thread.currentThread().getName());

	}

}
