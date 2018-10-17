package inheritance;

//A complete implementation of Box3Weight.
class Box3 {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box3(Box3 ob) { // pass object to constructor
	width = ob.width;
	height = ob.height;
	depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box3(double w, double h, double d) {
	width = w;
	height = h;
	depth = d;
    }

    // constructor used when no dimensions specified
    Box3() {
	width = -1; // use -1 to indicate
	height = -1; // an uninitialized
	depth = -1; // box
    }

    // constructor used when cube is created
    Box3(double len) {
	width = height = depth = len;
    }

    // compute and return volume
    double volume() {
	return width * height * depth;
    }
}

// Box3Weight now fully implements all constructors.
class Box3Weight extends Box3 {
    double weight; // weight of box
    // construct clone of an object

    Box3Weight(Box3Weight ob) { // pass object to constructor
	super(ob);
	weight = ob.weight;
    }

    // constructor when all parameters are specified
    Box3Weight(double w, double h, double d, double m) {
	super(w, h, d); // call superclass constructor
	weight = m;
    }

    // default constructor
    Box3Weight() {
	super();
	weight = -1;
    }

    // constructor used when cube is created
    Box3Weight(double len, double m) {
	super(len);
	weight = m;
    }
}

class Super {
    public static void main(String args[]) {
	Box3Weight mybox1 = new Box3Weight(10, 10, 10, 34.3);
	Box3Weight mybox2 = new Box3Weight(10, 10, 20, 0.076);
	Box3Weight mybox3 = new Box3Weight(); // default
	Box3Weight mycube = new Box3Weight(3, 2);
	Box3Weight myclone = new Box3Weight(mybox1);
	double vol;
	vol = mybox1.volume();
	System.out.println("Volume of mybox1 is " + vol);
	System.out.println("Weight of mybox1 is " + mybox1.weight);
	System.out.println();
	vol = mybox2.volume();
	System.out.println("Volume of mybox2 is " + vol);
	System.out.println("Weight of mybox2 is " + mybox2.weight);
	System.out.println();
	vol = mybox3.volume();
	System.out.println("Volume of mybox3 is " + vol);
	System.out.println("Weight of mybox3 is " + mybox3.weight);
	System.out.println();
	vol = mycube.volume();
	System.out.println("Volume of mycube is " + vol);
	System.out.println("Weight of mycube is " + mycube.weight);
	System.out.println();
	vol = myclone.volume();
	System.out.println("Volume of myclone is " + vol);
	System.out.println("Weight of myclone is " + myclone.weight);
	System.out.println();
	System.out.println(mybox1.hashCode());
	System.out.println(myclone.hashCode());
    }
}