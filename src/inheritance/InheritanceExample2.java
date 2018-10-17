package inheritance;

class Box1 {
    private double height;
    private double width;
    private double depth;

    // Construct clone of an object
    Box1(Box1 obj) {
	height = obj.height;
	width = obj.width;
	depth = obj.depth;
    }

    // Constructor when all dimensions are specified
    Box1(double h, double w, double d) {
	height = h;
	width = w;
	depth = d;
    }

    // Constructor when no dimensions are specified
    Box1() {
	height = width = depth = -1;
    }

    // Constructor for cube
    Box1(double length) {
	height = width = depth = length;
    }

    // Compute and return volume
    double volume() {
	return height * width * depth;
    }
}

class Box1Weight extends Box1 {
    double weight;

    // constructor for Box1weight using SUPER keyword
    Box1Weight(double h, double w, double d, double we) {
	super(h, w, d);
	weight = we;
    }
    /*double volumeWithWeight() {
	return height * width * depth * weight;
    }*/
    // In above block if we remove comments then return statement would give error because height, width, weight are private and cannot be accessed. Hence using super keyword could able to access it but cannot initialize it like in previous example.
}

class InheritanceExample2 {
    public static void main(String[] args) {
	Box1Weight a = new Box1Weight(1, 2, 3, 4);
	Box1Weight b = new Box1Weight(5, 6, 7, 8);
	
	System.out.println(a.volume());
	System.out.println(a.weight);
	//System.out.println(a.volumeWithWeight());
	System.out.println();
	
	System.out.println(b.volume());
	System.out.println(b.weight);
	//System.out.println(b.volumeWithWeight());
    }
}