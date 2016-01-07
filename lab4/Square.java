package ua.goit.andre.lab4;

public class Square {
	
	public static double SquareBox (double a, double b) {
		return a*b;
	}
	
	public static double SquareTriangle(double a, double b, double c){
		double p=a+b+c;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
	}

	public static double SquareCircle(double r) {
		return Math.PI*r*r;
	}
}
