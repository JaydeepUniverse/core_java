package class_method_object;

class Overload1{
    
    void test() {
	System.out.println("No Parameter");
    }
    void test(int i) {
	System.out.println(i);
    }
    void test(int i, int j) {
	System.out.println(i + " " + j);
    }
    void test(double i) {
	System.out.println(i);
    }
    double test(double i, double j) {
	return i*j;
    }
}

class MethodOverloading1 {
    public static void main(String[] args) {
	Overload1 a = new Overload1();
	double b = 12.12;
	double c;
	
	a.test();
	a.test(1);
	a.test(1, 2);
	a.test(b);
	c = a.test(12.12, 12.12);
	System.out.println(c);
    }
}
