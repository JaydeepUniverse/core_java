// Program Logic is Wrong, Correct it
// Find all prime number between 0 and the given number 
package controlFlow_Statements;

import java.util.Scanner;

public class PrimeNumber3 {
    public static void main(String[] args) {
	int a;
	int b;
	
	Scanner e = new Scanner(System.in);
	System.out.println("Enter any number:");
	a  = e.nextInt();
	
	if (a==0 || a==1) {
	    System.out.println(a + " is Not Prime Number");
	}
	else if (a == 2){
	    System.out.println(a + " is Prime Number");
	}
	else if (a>2){
	    System.out.println("Prime Numbers : 2");
	    for(b=2; b<=a; b++) {
		if(b%2 != 0) {
		    System.out.println("Prime Numbers : " + b);
		}
		    /*else {
			System.out.println(b);
		    }*/
	    }
	}
	
	
	/*if(c==1) {
	    System.out.println("Number is Prime");
	}
	else {
	    System.out.println("Number is Not Prime");
	}*/
	
	e.close();
    }
}
