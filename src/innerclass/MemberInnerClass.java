package innerclass;

public class MemberInnerClass {
    private int x=10;
    public void outer() {
	System.out.println("Outer class " + x);
    }
    
    class Inner{
	private int y=20;
	public void inner() {
	    System.out.println("Inner class " + y);
	    System.out.println("Outer class variable can be accessed by Inner class " + x);
	}
    }
    
    public static void main(String[] args) {
	MemberInnerClass a = new MemberInnerClass();
	a.outer();
	MemberInnerClass.Inner b = a.new Inner();
	b.inner();
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
    }
}
