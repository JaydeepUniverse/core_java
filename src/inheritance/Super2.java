package inheritance;

class A1{
    int i;
}

class B1 extends A1{
    int i; // Here i hides the i in A
    
    B1(int a, int b){
	super.i = a;
	i = b;
    }
    
    void show() {
	System.out.println("i in superclass : " + super.i);
	System.out.println("i in subclass : " + i);
    }
}

class Super2{
    public static void main(String[] args) {
	B1 b = new B1(1, 2);
	b.show();
    }
}
// This second form of super is most applicable to situations in which member names of a subclass hide members by the same name in the superclass.