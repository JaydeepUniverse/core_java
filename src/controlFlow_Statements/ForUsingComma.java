package controlFlow_Statements;

public class ForUsingComma {
    public static void main(String[] args) {
	int a,b;
	
	for(a=6,b=1; a>=b; a--,b++) {
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	}
    }
}
