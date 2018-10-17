package class_method_object;

class Outer {
    private int a = 100;

    class Inner1 {
	void display1() {
	    System.out.println("Value of a is " + a);
	}
    }

    void test1() {
	Inner1 b = new Inner1();
	b.display1();
    }

    void test2() {
	for (int i = 0; i < 5; i++) {
	    class Inner2 {
		void display2() {
		    System.out.println(a);
		}
	    }
	    Inner2 i2 = new Inner2();
	    i2.display2();
	}
    }

}

class InnerClass {
    public static void main(String[] args) {
	Outer a = new Outer();
	a.test1();
	Outer b = new Outer();
	b.test2();
    }
}