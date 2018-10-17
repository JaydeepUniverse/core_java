package instanceOf;

public class MainMethodForShape {
    
    public static void show(Shape s1) {
	    if(s1 instanceof Circle) {
		Circle c1 = (Circle)s1;
		c1.area();
		c1.print();
	    }
    }
	    
    public static void main(String[] args) {	
	Circle c1 = new Circle(4);
	MainMethodForShape.show(c1);
    	}
}
