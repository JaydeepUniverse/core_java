package class_method_object;

public class BoxWithReturnType{
    double height;
    double weight;
    double depth;
    
    double volume() {
	return height * weight * depth;
    }
    
    public static void main(String[] args) {
	BoxWithReturnType a = new BoxWithReturnType();
	BoxWithReturnType b = new BoxWithReturnType();
	BoxWithReturnType c = new BoxWithReturnType();
	double vol;
	
	a.height = 10;
	a.weight = 15;
	a.depth = 20;
	
	b.height = 3;
	b.weight = 6;
	b.depth = 9;
	
	c.height = 1;
	c.weight = 1;
	c.depth = 1;
	
	vol = a.volume();
	System.out.println(vol);
	
	vol = b.volume();
	System.out.println(vol);
	
	/*The preceding program can be written a bit more efficiently because
	there is actually no need for the vol variable. The In this case, when println( ) is executed, myBoxWithReturnType.volume( ) will be called automatically and
	its value will be passed to println( ).*/
	System.out.println(c.volume());
    }
}
