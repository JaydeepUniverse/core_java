package inheritance;

class A{
    int a;
    private int b;
    void showa() {
	System.out.println("a : " + a);
    }
}

class B extends A{
    int b1;
    void showb() {
	System.out.println("b1 : " + b1);
    }
    void sum() {
	System.out.println("a + b1 : " + (a+b1));
    }
}

class C extends B{
    int c;
    void showc() {
	System.out.println("c : " + c);
    }
    void sum() {
	// System.out.println("a+b+c : " + (a+b+c)); this lines contains error that A.b is not visible here because b is private member of class A, which is not accessible
	System.out.println("a+c : " + (a+c));
    }
}

class SimpleInheritance{
    public static void main(String[] args) {
	A a = new A();
	B b = new B();
	C c = new C();
	
	a.a = 10;
	System.out.println("from class A");
	a.showa();
	
	b.a = 100;
	b.b1 = 200;
	System.out.println("from class B");
	b.showa();
	b.showb();
	b.sum();
	
	c.a = 1000;
	c.b1 = 2000;
	c.c = 3000;
	System.out.println("from class C");
	c.showa();
	c.showb();
	c.showc();
	c.sum();
    }
}