package dev.soer.labs;

public class Ball {
	String size;
	String color;
	
	public void bounce() {
		System.out.println("The " + size + " " + color + " ball is bouncing");
	}
	
	public static void main(String[] args) {
		Ball b1 = new Ball(); // create new instance of the ball class
		Ball b2 = new Ball();
		
		b1.size = "big"; // set b1 size to "big"
		b1.color = "red"; // set b1 color to "red"
		b2.size = "big";
		b2.color = "blue";
		
		b1.bounce();
		b2.bounce();
	}
}
