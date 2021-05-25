package dev.soer.garbagecollection;

public class GarbageDriver {

	static long start = System.nanoTime();
	public static void main(String[] args) {
		System.out.println("Instantiating a new GarbageDriver object...");
		
		GarbageDriver garbage = new GarbageDriver();
		
		System.out.println("GarbageDriver object successfully created!");
		
		System.out.println("Some time passes");
		
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("assign the variable garbage to null");
		garbage = null;
		
		
		System.out.println("Assign the variable 'garbage' to some other GarbageDriver object");
		//garbage = new GarbageDriver();
		
		System.gc(); // NEVER DO THIS
		
		for(;;) {
			System.out.println("DONT DO THIS");
		}
		
	}
	
	@Override
	protected void finalize() {
		long end = System.nanoTime();
		System.out.println("GarbageDriveer's finalize() method called");
		System.out.println("Goodbye, cruel world...");
		System.out.println("Time: " + (end - start) / 1E+9);
		System.exit(0);
	}
	
}
