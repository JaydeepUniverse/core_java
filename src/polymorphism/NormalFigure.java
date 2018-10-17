package polymorphism;

public class NormalFigure {
    double a, b;
    
    NormalFigure(double i, double j){
	a = i;
	b = j;
    }
    
    double area() {
	System.out.println("Area of figure is Undefined.");
	return 0;
    }
}
