package polymorphism;

public class Triangle extends Figure {
    Triangle(double a, double b){
	super(a, b);
    }
    
    public double area() {
	System.out.println("Triangle");
	return 0.5 * dim1 * dim2;
    }
}
