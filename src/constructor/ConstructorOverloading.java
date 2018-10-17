package constructor;

public class ConstructorOverloading {
    double height;
    double width;
    double depth;
    
    ConstructorOverloading(){
	height = -1;  // user -1 to indicate uninitialized box
	width = -1;
	depth = -1;
    }
    ConstructorOverloading(double i){
	height = width = depth = i; // when cube is created with same dimensions
    }
    ConstructorOverloading(double h, double w, double d){
	height = h;
	width = w;
	depth = d;
    }
    
    void volume1() {
	System.out.println((height * width * depth));
    }
    double volume2() {
	return height * width * depth;
    }
    
    public static void main(String[] args) {
	ConstructorOverloading a = new ConstructorOverloading();
	ConstructorOverloading b = new ConstructorOverloading(2);
	ConstructorOverloading c = new ConstructorOverloading(1,2,3);
	double vol;
	
	a.volume1();
	b.volume1();
	vol = c.volume2();
	System.out.println(vol);
    }
}
