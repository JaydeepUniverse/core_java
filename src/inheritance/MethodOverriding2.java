package inheritance;

class A4{
    int a;
    A4(int i){
	a = i;
    }
    void show() {
	System.out.println("class A value of a : " + a);
    }
}

class B4 extends A4{
    int b;
    B4(int i, int j){
	super(i);
	b = j;
    }
    void show() {
	super.show();
	System.out.println("class B value of b : " + b);
    }
}

public class MethodOverriding2 {
    public static void main(String[] args){
	B4 b = new B4(1, 2);
	b.show();
    }
}
//If you wish to access the superclass version of an overridden method, you can do so by using super. For example, in this version of B, the superclass version of show( ) is invoked within the subclass’ version.