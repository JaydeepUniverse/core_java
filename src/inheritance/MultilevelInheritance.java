package inheritance;

//Extend Box5Weight to include shipping costs.
//Start with Box5.
class Box5 {
    private double width;
    private double height;
    private double depth;

    // constructor used when all dimensions specified
    Box5(double w, double h, double d) {
	width = w;
	height = h;
	depth = d;
    }

    // compute and return volume
    double volume() {
	return width * height * depth;
    }
}

// Add weight.
class Box5Weight extends Box5 {
    double weight; // weight of Box5

    // constructor when all parameters are specified
    Box5Weight(double w, double h, double d, double m) {
	super(w, h, d); // call superclass constructor
	weight = m;
    }
}

// Add shipping costs.
class Shipment extends Box5Weight {
    double cost;

    // constructor when all parameters are specified
    Shipment(double w, double h, double d, double m, double c) {
	super(w, h, d, m); // call superclass constructor
	cost = c;
    }
}

class MultilevelInheritance {
    public static void main(String args[]) {
	Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
	Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
	double vol;
	vol = shipment1.volume();
	System.out.println("Volume of shipment1 is " + vol);
	System.out.println("Weight of shipment1 is " + shipment1.weight);
	System.out.println("Shipping cost: $" + shipment1.cost);
	System.out.println();
	vol = shipment2.volume();
	System.out.println("Volume of shipment2 is " + vol);
	System.out.println("Weight of shipment2 is " + shipment2.weight);
	System.out.println("Shipping cost: $" + shipment2.cost);
    }
}