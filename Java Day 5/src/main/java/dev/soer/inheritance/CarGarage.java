package dev.soer.inheritance;

public class CarGarage {

	public static void main(String[] args) {
		Car c = new Car("New Car", 800, "black");
		
//		System.out.println(c);
//		
//		System.out.println(c.getName());
//		System.out.println(c.getMileage());
//		System.out.println(c.getColor());
//		
//		c.setName(null);;
//		c.setMileage(-1);
//		c.setColor(null);
//		
//		System.out.println(c);
//		
//		c.setName("Crosstrek");
//		c.setMileage(10000);
//		c.setColor("Purple and Gold");
//		
//		System.out.println(c);
		
		c.drive();
		
		Subaru cross = new Subaru("Crosstrek", 12, "blue");
		
		System.out.println(cross);
		
		cross.driveSomeDistance(1000);
		System.out.println(cross);
		
		Car newCar = new Subaru("Another car", 1000, "silver");
		newCar.drive();
		newCar.drive(10);
		//newCar.driveSomeDistance(100);
		System.out.println(newCar);
	}
}
