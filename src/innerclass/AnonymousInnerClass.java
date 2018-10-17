package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
	Printable a = new Printable() {
	    
	    @Override
	    public void print() {
		System.out.println("Hi");
	    }
	};
	a.print();
	System.out.println(a.hashCode());
	
	Shape b = new Shape() {
	    
	    @Override
	    public void area() {
		System.out.println("Hello");
	    }
	};
	b.area();
    }
}

// to understand the usage of anonymous inner class, compare this printable interface example from abstract package where we needed to implement the interface and then we could have used it using creaating object of main class, but here without implements and without creation of main class object we can create object of interface directly.
