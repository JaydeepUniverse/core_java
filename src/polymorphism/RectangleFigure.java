package polymorphism;

public class RectangleFigure extends NormalFigure {
    RectangleFigure(double i, double j){
	super(i, j);
    }
    
    double area() {
	System.out.println("Area of Rectangle : ");
	return a * b;
    }
}
