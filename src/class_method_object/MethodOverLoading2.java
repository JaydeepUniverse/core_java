package class_method_object;

class Overload2{
    void test() {
	System.out.println("No Parameters");
    }
    
    void test(int a, int j) {
	System.out.println(a);
    }
    
    void test(double a) {
	System.out.println(a*a);
    }
}

class MethodOverLoading2 {
    public static void main(String[] args) {
	Overload2 a = new Overload2();
	int b = 2;
	
	a.test();
	a.test(1, 2);
	a.test(b);//Java can automatically convert an integer into a double, and this conversion can be used to resolve the call. Therefore, after test(int) is not found, Java elevates i to double and then calls test(double). Of course, if test(int) had been defined, it would have been called instead. Java will employ its automatic type conversions only if no exact match is found.
	a.test(12.12);
    }
}
