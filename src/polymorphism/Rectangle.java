package polymorphism;

public class Rectangle extends Figure{
    Rectangle(double a, double b){
	super(a, b);
    }
    
    public double area() {
	System.out.println("Rectangle");
	return dim1 * dim2;
    }
}
