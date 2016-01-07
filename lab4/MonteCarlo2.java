package ua.goit.andre.lab4;

public class MonteCarlo2 {
    public MonteCarlo2(){
    }
    
    public static void main (String agrs[]) {
	long max = 1000000;
	long i;
	double integral;
	double sum = 0;
	double x,y;
	double radius=5;

	for (i = 0; i < max; i++) {
	    x = java.lang.Math.random()*radius;
	    y = java.lang.Math.random()*radius;
	    if (y <= java.lang.Math.sqrt(radius*radius-x*x)) {
	    	sum += 1;
	    }
	}

	integral = 4*sum / max;
	System.out.println(""+ integral);
    }
}