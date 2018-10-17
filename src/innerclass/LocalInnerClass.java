package innerclass;

public class LocalInnerClass {
    private int a = 10;
    public void show() {
	System.out.println("a calling from Outer class" + a);
	class Inner{
	    private int b = 10;
	    public void print() {
		System.out.println("a calling from Inner class"+ a);
		System.out.println("b inner class variable"+ b);
	    }
	}
	Inner a = new Inner();
	a.print();
    }
    public static void main(String[] args) {
	LocalInnerClass b = new LocalInnerClass();
	b.show();
    }
}
