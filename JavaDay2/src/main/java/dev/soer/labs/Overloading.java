package dev.soer.labs;

public class Overloading {

	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.print();
		ov.print("second print method");
		ov.print("second", "third");
	}
	
	public void print() {
		System.out.println("Original print method");
	}
	public void print(String str) {
		System.out.println(str);
	}
	public void print(String str, String str2){  
        System.out.println(str + " " + str2);  
    }
	
}
