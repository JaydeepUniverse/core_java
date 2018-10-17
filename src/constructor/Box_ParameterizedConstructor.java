package constructor;

class Box2{
    double height;
    double width;
    double depth;
    
    Box2(double h, double w, double d){
	height = h;
	width = w;
	depth = d;
    }
    
    void volume() {
	System.out.println(height * width * depth);
    }
    
    double vol() {
	return height * width * depth;
    }
}

class Box_ParameterizedConstructor {
    public static void main(String[] args) {
	Box2 a = new Box2(10, 15, 20);
	Box2 b = new Box2(3, 6, 9);
	Box2 c = new Box2(1, 1, 1);
	double v;
	
	a.volume();
	b.volume();
	
	v = c.vol();
	System.out.println(v);
    }
}
