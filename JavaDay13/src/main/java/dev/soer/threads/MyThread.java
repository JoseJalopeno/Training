package dev.soer.threads;

public class MyThread extends Thread{

	int changeVal;
	
	public MyThread() {
		this.changeVal = 3;
	}
	
	public MyThread(int changeVal) {
		this.changeVal = changeVal;
	}
	
	@Override
	public void run() {
		System.out.println("Running.... " + Thread.currentThread());
		Resource.change(changeVal, 3000);
	}
	
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread(5);
		
		t1.setName("Thread A");
		t2.setName("Thread B");
		
//		t1.setPriority(MAX_PRIORITY);
//		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();	
		
	}
}
