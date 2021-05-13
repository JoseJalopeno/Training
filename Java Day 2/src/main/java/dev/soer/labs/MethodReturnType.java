package dev.soer.labs;

public class MethodReturnType {

	public static void main(String[] args) {
		MethodReturnType rt = new MethodReturnType();
		rt.returnNothing();
		boolean b = rt.returnBoolean();
		
		System.out.println("The value of b is: " + b);
	}
	
	 public void returnNothing(){
        System.out.println("Inside of a void method");
    }
	 public boolean returnBoolean() {
		return true;
		 
	 }
}
