package exception_handling;

public class Throw {
    private int marks=30;
    
    public void pass() {
	if(marks<40) {
		try {
		    throw new Exception();
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("Exception block");
		}
	    }
	else {
	    System.out.println("else block");
	}
	System.out.println("pass method block");
    }
    
    public static void main(String[] args) {
	Throw a = new Throw();
	a.pass();
	System.out.println("main block");
    }
}
