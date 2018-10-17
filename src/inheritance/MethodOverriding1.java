package inheritance;

class A3{
    int a;
    A3(int i){
	a = i;
    }
    void show() {
	System.out.println("class A value of a : " + a);
    }
}

class B3 extends A3{
    int b;
    B3(int i, int j){
	super(i);
	b = j;
    }
    void show() {
	System.out.println("class B value of b : " + b);
    }
}

public class MethodOverriding1 {
    public static void main(String[] args){
	B3 b = new B3(1, 2);
	b.show();
    }
}
//In a class hierarchy, when a method in a subclass has the same name and type signature as a method in its superclass, then the method in the subclass is said to override the method in the superclass. When an overridden method is called from within its subclass, it will always refer to the version of that method defined by the subclass. The version of the method defined by the superclass will be hidden.