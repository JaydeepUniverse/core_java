package polymorphism;

public class FigureMain {
    public static void main(String[] args) {
	Figure a = new Figure(10, 10);
	Rectangle b = new Rectangle(20, 20);
	Triangle c = new Triangle(30, 30);
	
	System.out.println(a.area());
	System.out.println(b.area());
	System.out.println(c.area());
    }
}
