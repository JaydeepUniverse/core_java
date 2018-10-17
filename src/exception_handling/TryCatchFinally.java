package exception_handling;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int a, b;
	a = s.nextInt();
	b = s.nextInt();
	//System.out.println("Test");
	//System.exit(0);
	try {
	    int c = a / b;
	    System.out.println(c);
	    //System.exit(0); // Remove this system.out comment and see, if the program get executed properly then finally won't execute, hence if we need finally to be executed then make sure that program must not terminated before the catch and finally
	    
	    // System.out.println("Code after c=a/b"); // this code won't execute if we divide by zero hence it should be part of catch block
	} catch (ArithmeticException e) {
	    System.out.println(e);
	    System.out.println();
	    System.out.println("Code after c=a/b");
	} finally {
	    System.out.println();
	    System.out.println("Always Excecute even if catch executed. This block can be used when something is really necessary to execute, for example scanner close can be written here");
	    s.close();
	}
	System.out.println();
	System.out.println("After all code");
	/*
	 * Try with this first catch(Exception e) { System.out.println(e); }
	 *In first trycatch program we wrote s.close out of try and catch but here can be part of finally
	 */
    }
}
