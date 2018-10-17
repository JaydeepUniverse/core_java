package controlFlow_Statements;

public class Break3 {
    public static void main(String[] args) {
	boolean t = true;
	
	first: {
	    second: {
	    	third: {
	    		System.out.println("Before Break");
	    		if(t)
	    		    break second; // break out of second block
	    		System.out.println("This won't be executed");
		}
		System.out.println("This also won't be executed");
	    }
	    System.out.println("This will be executed");
	}
    }
}
