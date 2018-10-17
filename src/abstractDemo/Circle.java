package abstractDemo;

public class Circle extends Shape {

    public Circle(int dia1) {
	super(dia1);
    }
    
    @Override
    public void area() {
	area = 3.14 * dia1 * dia1;
    }
}
