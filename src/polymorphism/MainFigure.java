package polymorphism;

public class MainFigure {
    public static void main(String[] args) {
	NormalFigure a = new NormalFigure(10, 10);
	RectangleFigure b = new RectangleFigure(20, 20);
	TriangleFigure c = new TriangleFigure(30, 30);
	
	System.out.println(a.area());
	System.out.println(b.area());
	System.out.println(c.area());
    }
}
