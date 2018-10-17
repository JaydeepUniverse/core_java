package exception_handling;

public class Throw2 {
    private int marks=30;
    
    public void pass() {
	if(marks<40) {
		try {
		    throw new Exception();
		} catch (Exception e) {
		    System.out.println(e);
		    System.out.println("Exception block");
		}
	    }
	else {
	    System.out.println("else block");
	}
	System.out.println("pass method block");
	System.err.println("jjjj");
    }
    
    public static void main(String[] args) {
	Throw2 a = new Throw2();
	a.pass();
	System.out.println("main block");
    }
}
