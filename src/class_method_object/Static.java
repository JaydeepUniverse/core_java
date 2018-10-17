package class_method_object;

class Static {
    static int a = 4;
    static int b;
    
    static void meth(int x) {
	System.out.println(x);
	System.out.println(a);
	System.out.println(b);
    }
    
    static {
	System.out.println("Static bolc initialized.");
	b = a * 3;
    }
    
    public static void main(String[] args) {
	meth(48); // Here meth has been called from same class
    }
}
