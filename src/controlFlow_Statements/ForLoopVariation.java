package controlFlow_Statements;

public class ForLoopVariation {
    public static void main(String[] args) {
	boolean b = false;
	int i=0;
	
	for( ; !b; ) { // this type for loop can be used when the conditional statement is complex
	    System.out.println("i is " + i);
	    if (i==10)
		b = true;
	    i++;
	}
    }
}
