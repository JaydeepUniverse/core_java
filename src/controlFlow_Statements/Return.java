package controlFlow_Statements;

public class Return {
    public static void main(String[] args) {
	boolean a = true;
	
	System.out.println("Before Return");
	
	if(a)
	    return;
	
	System.out.println("This statement won't be executed.");
    }
}
