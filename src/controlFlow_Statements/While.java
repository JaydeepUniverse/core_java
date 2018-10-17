package controlFlow_Statements;

public class While{
    public static void main(String[] args) {
	int n = 10;
	while(n>0) {
	    System.out.println("print " + n);
	    n--;
	}
	
	// Another example of while with find mid - point without any body in while
	int i = 10;
	int j = 20;
	while(++i < --j); // no body
	System.out.println("midpoint between 10 and 20 is " + i);
    }
}