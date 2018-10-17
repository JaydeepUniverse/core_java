package class_method_object;

public class BoxWithMethod {
    double height;
    double width;
    double depth;
    
    // Method Declaration
    void volume() {
	System.out.println("Volume is " + (height * width * depth));
    }
}
