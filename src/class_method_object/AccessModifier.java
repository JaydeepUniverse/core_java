package class_method_object;

class Test1 {
    int a; // default access modifier
    public int b; // public access modifier
    private int c; // private access modifier
    
    void setc(int i) {
	c = i;
    }
    
    int getc() {
	return c;
    }
}

class AccessModifier{
    public static void main(String[] args) {
	Test1 a = new Test1();
	a.a = 10;
	a.b = 20;
	// a.c = 30; this will give run time error
	
	a.setc(30); // c only can be accessed by its method
	System.out.println(a.a + " " + a.b + " " + a.getc());
    }
}