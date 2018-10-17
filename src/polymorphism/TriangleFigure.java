package polymorphism;

public class TriangleFigure extends NormalFigure{
    TriangleFigure(double i, double j){
	super(i, j);
    }
    
    double area() {
	System.out.println("Area of Triangle is : ");
	return 0.5 * a * b;
    }
}
