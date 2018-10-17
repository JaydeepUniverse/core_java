package polymorphism;

public class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b){
	dim1 = a;
	dim2 = b;
    }
    
    public double area() {
	System.out.println("Main Figure class");
	return 0;
    }
}
