package misc;

class A{
    void callme(){
	System.out.println("Class A Method");
    }
}

class B extends A{
    void callme() {
	System.out.println("Class B Method");
    }
}

class C extends A{
    void callme() {
	System.out.println("Class C Method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
	A a = new A();
	B b = new B();
	C c = new C();
	
	a.callme();
	b.callme();
	c.callme();
	
	A r;
	r = a;
	a.callme();
	r=b;
	r.callme();
	r=c;
	r.callme();
	
	A x = new A();
	A y = new B();
	A z = new C();
	x.callme();
	y.callme();
	z.callme();
	
    }
}
