package dev.soer.labs;

public class MethodParameters {

	public static void main(String[] args) {
		MethodParameters mp = new MethodParameters();
		double d = mp.convertIntToDouble(44);
		System.out.println(d);
		System.out.println(mp.sum(1.0, 2, 3));
	}
	
	public double convertIntToDouble(int num){
	    return (double)num;
	}
	public double sum(double num1, int num2, int num3){
	    return num1 + num2 + num3;  
	}
}
