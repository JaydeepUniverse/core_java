// Match this concept with callbyreference
package constructor;

public class ObjectAsParameterInConstructor {
    double height;
    double width;
    double depth;
    
    ObjectAsParameterInConstructor(){
	height = -1;
	width = -1;
	depth = -1;
    }
    ObjectAsParameterInConstructor(double i){
	height = width = depth = i;
    }
    ObjectAsParameterInConstructor(double h, double w, double d){
	height = h;
	width = w;
	depth = d;
    }
    ObjectAsParameterInConstructor(ObjectAsParameterInConstructor o){
	height = o.height;
	width = o.width;
	depth = o.depth;
    }
    
    double volume() {
	return height * width * depth;
    }
    
    public static void main(String[] args) {
	ObjectAsParameterInConstructor a = new ObjectAsParameterInConstructor();
	ObjectAsParameterInConstructor b = new ObjectAsParameterInConstructor(2);
	ObjectAsParameterInConstructor c = new ObjectAsParameterInConstructor(1,2,3);
	ObjectAsParameterInConstructor d = new ObjectAsParameterInConstructor(a);
	
	System.out.println(a.volume());
	System.out.println(b.volume());
	System.out.println(c.volume());
	System.out.println(d.volume());
    }
}
