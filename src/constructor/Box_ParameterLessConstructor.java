package constructor;

class Box1{
    double height;
    double width;
    double depth;
    
    Box1(){
	height = 10;
	width = 15;
	depth = 20;
    }
    
    double volume() {
	return height * width * depth;
    }
}

class Box_ParameterLessConstructor {
    public static void main(String[] args) {
	Box1 a = new Box1();
	
	System.out.println(a.volume());
    }
}
/*When you do not explicitly define a constructor for a class, then Java creates a default constructor for the class. This is why the preceding line of code worked in earlier versions of Box that did not define a constructor. The default constructor automatically initializes all instance variables to their default values, which are zero, null, and false, for numeric types, reference types, and boolean, respectively. The default constructor is often sufficient for simple classes, but it usually won’t do for more sophisticated ones. Once you define your own constructor, the default constructor is no longer used.*/