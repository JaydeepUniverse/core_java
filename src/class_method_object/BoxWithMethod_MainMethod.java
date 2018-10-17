package class_method_object;

public class BoxWithMethod_MainMethod {
    public static void main(String[] args) {
	BoxWithMethod a = new BoxWithMethod();
	BoxWithMethod b = new BoxWithMethod();
	
	a.height = 10;
	a.width = 15;
	a.depth = 20;
	
	b.height = 3;
	b.width = 6;
	b.depth = 9;
	
	a.volume();
	
	b.volume();
    }
}
