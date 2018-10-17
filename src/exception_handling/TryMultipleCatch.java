package exception_handling;

import java.util.Scanner;

public class TryMultipleCatch {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int a = s.nextInt();
	int b = s.nextInt();

	try {
	    int c = a / b;
	    System.out.println("c = " + c);
	    String str = null;
	    System.out.println("string length" + str.length());
	    int arr[] = new int[5];
	    arr[8] = 8;
	}catch(NullPointerException e){
	    System.out.println(e);
	    System.out.println();
	    System.out.println("Code after null pointer exception");
	}catch (Exception e) {
	    System.out.println(e);
	    System.out.println();
	    System.out.println("Code after c = a/b");
	}
	System.out.println();
	System.out.println("Print this line after all exception has been defined");
	
	/* if we would have defined multiple catch as below then it would through compile time error that nullpointer exception is already part of Exception hence above sequence is mandatory
	 catch (Exception e) {
	    System.out.println(e);
	    System.out.println("Code after c = a/b");
	}catch(NullPointerException e){
	    System.out.println(e);
	    System.out.println("Code after null pointer exception");
	}
	to test this program first enter number 4 and 2 and see which exception comes and then next run enter 4 and 0 and see which exception comes
	*/
	s.close();
    }
}
