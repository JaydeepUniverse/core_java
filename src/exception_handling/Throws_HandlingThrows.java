package exception_handling;

public class Throws_HandlingThrows {
    private int a;
    private int b;
    
    public void math1() throws Exception{
	b = a/0;
    }
    public void math2() throws Exception{
	math1();
	System.out.println("In Math2");
    }
    public void math3() {
	System.out.println("In Math3");
	try {
	    math1();
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
    
    public static void main(String[] args) {
	Throws_HandlingThrows a = new Throws_HandlingThrows();
	a.math3();
	System.out.println("In Main Method");
    }
}
