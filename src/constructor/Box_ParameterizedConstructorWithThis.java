package constructor;

class Box3{
    double height;
    double width;
    double depth;
    
    Box3(double h, double w, double d){
	this.height = h;
	this.width = w;
	this.depth = d;
    }
    
    void volume() {
	System.out.println(height * width * depth);
    }
    
    double vol() {
	return height * width * depth;
    }
}

class Box_ParameterizedConstructorWithThis {
    public static void main(String[] args) {
	Box3 a = new Box3(1, 1, 1);
	Box3 b = new Box3(2, 2, 2);
	Box3 c = new Box3(3, 3, 3);
	double v;
	
	a.volume();
	b.volume();
	
	v = c.vol();
	System.out.println(v);
    }
}
