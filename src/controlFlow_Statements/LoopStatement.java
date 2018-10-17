package controlFlow_Statements;

public class LoopStatement {
    public static void main(String[] args) {
	int y1 = 5;
	for(int x=0; x<5; x++)
	    System.out.println("x is " + x);
	System.out.println();
	for(int x1=1; x1<=5; x1++) {
	    System.out.println("x1 is " + x1);
	    System.out.println("y1 is " + y1);
	    y1 = y1 - 1;
	}
    }
}