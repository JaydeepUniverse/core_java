package exception_handling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int a, b;
	a = s.nextInt();
	b = s.nextInt();
	try {
	    int c = a / b;
	    System.out.println(c);
	    // System.out.println("Code after c=a/b"); // this code won't execute if we divide by zero hence it should be part of catch block
	} catch (ArithmeticException e) {
	    System.out.println(e);
	    System.out.println();
	    System.out.println("Code after c=a/b");
	}
	/*
	 * Try with this first catch(Exception e) { System.out.println(e); }
	 */

	s.close();
    }
}
