package ua.goit.andre.lab4extra;

public class PiFunc extends AbstractFunc {
	private double radius; 
		
	public PiFunc(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double func(double x) {
		return java.lang.Math.sqrt(radius*radius-x*x);
	}

}
