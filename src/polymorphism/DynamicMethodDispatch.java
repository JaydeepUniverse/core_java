package polymorphism;

class A6{
    void callme() {
	System.out.println("Class A");
    }
}
class B6 extends A6{
    void callme() {
	System.out.println("Class B");
    }
}
class C6 extends A6{
    void callme() {
	System.out.println("Class C");
    }
}
class DynamicMethodDispatch {
    public static void main(String[] args) {
	A6 a = new A6();
	B6 b = new B6();
	C6 c = new C6();
	
	A6 r; // obtain a reference type A
	
	r = a; // r refers to an A object
	r.callme();
	
	r = b; // r refers to B object
	r.callme();
	
	r = c; // r refers to C object
	r.callme();
    }
}
// This program creates one superclass called A and two subclasses of it, called B and C. Subclasses B and C override callme( ) declared in A. Inside the main( ) method, objects of type A, B, and C are declared. Also, a reference of type A, called r, is declared. The program then in turn assigns a reference to each type of object to r and uses that reference to invoke callme( ). As the output shows, the version of callme( ) executed is determined by the type of object being referred to at the time of the call. Had it been determined by the type of the reference variable, r, you would see three calls to A’s callme( ) method.

// Let’s begin by restating an important principle: a superclass reference variable can refer to a subclass object. Java uses this fact to resolve calls to overridden methods at run time. Here is how. When an overridden method is called through a superclass reference, Java determines which version of that method to execute based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time. When different types of objects are referred to, different versions of an overridden method will be called. In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed. Therefore, if a superclass contains a method that is overridden by a subclass, then when different types of objects are referred to through a superclass reference variable, different versions of the method are executed.