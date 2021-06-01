package dev.soer.threads;
//simulate a resource needed by a thread
public class Resource {

	static int number = 0;
	
	// create a method to simulate the number (resource) and how long we want the task to take
	public synchronized static void change(int num, int delay) {
		try {
			System.out.println("Changing number...");
			System.out.println(Thread.currentThread());
			Thread.sleep(delay);
			number = num;
			System.out.println(number);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
	}
}
