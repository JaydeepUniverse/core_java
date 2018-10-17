package abstractDemo;

public class Triangle extends Shape {

    public Triangle(int base, int height) {
	super(base, height);
    }
    
    public void area() {
	area = 0.5 * base * height;
    }
}
