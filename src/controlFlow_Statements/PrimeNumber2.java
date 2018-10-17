// Program Logic is Wrong, Correct it
// Number is taken as an input from user
package controlFlow_Statements;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
	int a;
	int b;
	int c = 0;
	
	Scanner e = new Scanner(System.in);
	System.out.println("Enter any number:");
	a  = e.nextInt();
	
	for(b=2; b<=a; b++) {
	    if(a%2 == 0) {
		c = 0;
	    }
	    else {
		c = 1;
	    }
	}
	
	if(c==1) {
	    System.out.println("Number is Prime");
	}
	else {
	    System.out.println("Number is Not Prime");
	}
	
	e.close();
    }
}
