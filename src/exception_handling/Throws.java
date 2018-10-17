package exception_handling;

public class Throws {
    private int acc;
    
    public Throws(int acc) {
	this.acc = acc;
    }
    
    public void check(int accno) throws Exception{
	if(acc!=accno) {
	    throw new ThrowsInvalidAccountNo();
	}
	else {
	    System.out.println("Welcome");
	}
    }
    public static void main(String[] args) throws Exception {
	Throws a = new Throws(123);
	a.check(1231);
	System.out.println("hi");
    }
}
