package abstractDemo;

public class MainMethodForShape {
    public static void main(String[] args) {
	Circle s1 = new Circle(4);
	s1.area();
	s1.print();
	
	Shape s2 = new Triangle(2,3);
	s2.area();
	s2.print();
    }
}
