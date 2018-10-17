package controlFlow_Statements;

public class Break4 {
    public static void main(String[] args) {
	outer: {
		for(int i=0; i<3; i++) {
		    System.out.print("i : " + i + "\nj : ");
		    for(int j=0; j<100; j++) {
			if(j==10)
			    break outer; // exit both loops
			System.out.print(j);
		    }
		    System.out.println("This won't execute");
		}
    	}
    System.out.println();
    System.out.println("Loop Completed.");
    }
}
