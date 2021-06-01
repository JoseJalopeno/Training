package dev.soer.threads;

public class ThreadDriver {

	public static void main(String[] args) {
		/*
		 * we can use the runnable interface since it is a functional interface or we
		 * could use lambdas
		 */

		// define an implementation of Runnable
		Runnable task0 = () -> {
			System.out.println("Running: " + Thread.currentThread());
			Resource.change(1, 2000);
		};

		Runnable task1 = () -> {
			System.out.println("Running: " + Thread.currentThread());
			Resource.change(2, 3000);
		};
		
		Thread t0 = new Thread(task0);
		Thread t1 = new Thread(task1);
		
		Thread lambdaThread = new Thread(() -> {System.out.println("Running: " + Thread.currentThread());});
		
		lambdaThread.start();
		
		t0.start();
		t1.start();

	}

}
