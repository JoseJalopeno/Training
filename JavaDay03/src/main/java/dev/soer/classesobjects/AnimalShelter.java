package dev.soer.classesobjects;

public class AnimalShelter {

	public static void main(String[] args) {
		// Use the constructor to create a dog object
		// this will restore the memory needed to store all information about our dog object
		Dog myDog = new Dog(); // Reference Variable - stores an objects location in memory
		// Datatype reference variable = new (keyword) Constructor()
		myDog.name = "Fido";
		
		Dog notMyDog = new Dog();
		notMyDog.name = "Jane";
//		System.out.println(myDog.name);
//		System.out.println(notMyDog.name);
		
//		myDog.bark();
//		notMyDog.bark();
//		
//		myDog.bark(10);
//		notMyDog.bark(2);
//		
//		myDog.bark("Ruf ruf");
//		notMyDog.bark("Bark bark");
		
		Dog spot = new Dog("Spot", "Golden Retriever", 3);
		System.out.println(spot.age);
		spot.bark();
		
		Dog[] dogArray = new Dog[5];
		dogArray[0] = myDog;
		dogArray[1] = notMyDog;
		dogArray[2] = spot;
		
		for (Dog d : dogArray) {
			System.out.println(d);
		}
	}
}
