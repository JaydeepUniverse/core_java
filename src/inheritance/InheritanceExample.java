package inheritance;

class Box {
    double height;
    double width;
    double depth;

    // Construct clone of an object
    Box(Box obj) {
	height = obj.height;
	width = obj.width;
	depth = obj.depth;
    }

    // Constructor when all dimensions are specified
    Box(double h, double w, double d) {
	height = h;
	width = w;
	depth = d;
    }

    // Constructor when no dimensions are specified
    Box() {
	height = width = depth = -1;
    }

    // Constructor for cube
    Box(double length) {
	height = width = depth = length;
    }

    // Compute and return volume
    double volume() {
	return height * width * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    // constructor for boxweight
    BoxWeight(double h, double w, double d, double we) {
	height = h;
	width = w;
	depth = d;
	weight = we;
    }
    double volumeWithWeight() {
	return height * width * depth * weight;
    }
}

class InheritanceExample {
    public static void main(String[] args) {
	BoxWeight a = new BoxWeight(1, 2, 3, 4);
	BoxWeight b = new BoxWeight(5, 6, 7, 8);
	
	System.out.println(a.volume());
	System.out.println(a.weight);
	System.out.println(a.volumeWithWeight());
	System.out.println();
	
	System.out.println(b.volume());
	System.out.println(b.weight);
	System.out.println(b.volumeWithWeight());
    }
}