package abstractDemo;

public abstract class Figure {
    public double dim1;
    public double dim2;
    
    Figure(double a, double b){
	dim1 = a;
	dim2 = b;
    }
    
    public abstract double area();
}
