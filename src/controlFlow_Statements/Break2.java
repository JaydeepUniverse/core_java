package controlFlow_Statements;

public class Break2 {
    public static void main(String[] args) {
	int i,j;
	
	for(i=0; i<3; i++) {
	    System.out.print("i = " + i + " j = ");
	    for(j=1; j<100; j++) {
		System.out.print(j);
		if(j==10)
		    break; // affects only inner loop, i's loop will continue
	    }
	    System.out.println();
	}
	System.out.println("Loop Complete");
    }
}
