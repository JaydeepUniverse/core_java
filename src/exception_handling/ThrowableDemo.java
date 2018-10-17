package exception_handling;

public class ThrowableDemo {
private int accno;
    
    public ThrowableDemo(int accno) {
	this.accno = accno;
    }
    @Override
    protected void finalize() throws Throwable{
	super.finalize();
	System.out.println("In Finalize Method");
    }
    
    public static void main(String[] args) {
	ThrowableDemo a = null;
	System.out.println("In Main Method");
	System.gc();
	System.out.println("Hiii");
    }
}
