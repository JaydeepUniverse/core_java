package abstractDemo;

public class FigureMain {
    public static void main(String[] args) {
	Rectangle a = new Rectangle(10, 10);
	Triangle2 b = new Triangle2(20, 20);
	System.out.println(a.area());
	System.out.println(b.area());
    }
}
