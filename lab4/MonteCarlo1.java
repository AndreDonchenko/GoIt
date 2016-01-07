package ua.goit.andre.lab4;

public class MonteCarlo1 {

	static double func(double x)
	{
	        return 1-x*x; 
	}
	
	public static void main(String[] args) {
		
		int pointA = -1; 
	    int pointB = 1;
	    int numberOfRandom=100000; 
	    double s=0; 
	    double x;
	    double y;
        for (int i = 0; i < numberOfRandom; i++) 
	        {
	             x = 2.0*java.lang.Math.random()-1.0; //генерируем x в интервале [-1,1]
	             y = java.lang.Math.random(); //генерируем y в интервале [0,1]
	             if( y < func(x) ) {
	            	 s+=1;
	             }
	        }
	        s=s/(double)numberOfRandom*(pointB-pointA);
	        System.out.println(s);
	}
	
}
