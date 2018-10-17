package constructor;

class Box4{
    double height;
    double width;
    double depth;
    
    /*Below constructor would not have any impact without this keyword, reasons is, here height would refer to the local variable of the class = local variable of class
     * Box4(double height, double width, double depth){
	height = height;
	width = width;
	depth = depth;
    }*/
    
    // Here it would work, reason is, this.height would refer to the current calling object. That is, "this"-keyword is always a reference to the object on which the method was invoked. Due to which this variable would differ from the actual class instance variable height.
    Box4(double height, double width, double depth){
	this.height = height;
	this.width = width;
	this.depth = depth;
    }
    
    void volume() {
	System.out.println(height * width * depth);
    }
    
    double vol() {
	return height * width * depth;
    }
}

class Box_ParameterizedConstructorWithThis2 {
    public static void main(String[] args) {
	Box4 a = new Box4(4, 4, 4);
	Box4 b = new Box4(5, 5, 5);
	Box4 c = new Box4(6, 6, 6);
	double v;
	
	a.volume();
	b.volume();
	
	v = c.vol();
	System.out.println(v);
    }
}
