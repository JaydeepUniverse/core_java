package polymorphism;

public class MainMethodStudent {
    public static void main(String[] args) {
	ChildScience s1 = new ChildScience(1, "a", 1000, "Science");
	s1.calculateFees();
	s1.printDetails();
	
	ChildCommerce c1 = new ChildCommerce(2, "b", 1000, "Commerce");
	c1.calculateFees();
	c1.printDetails();
    }
}
