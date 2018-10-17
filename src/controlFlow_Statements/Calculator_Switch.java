package controlFlow_Statements;

import java.util.Scanner;

public class Calculator_Switch {
    
    public static void main(String[] args) {
	
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter 1 for Addition");
	System.out.println("Enter 2 for Subtraction");
	System.out.println("Enter 3 for Multiplication");
	System.out.println("Enter 4 for Division");
	
	int n=s1.nextInt();
	
	switch(n) {
	case 1:
	    Scanner addition=new Scanner(System.in);
	    System.out.println("Enter first number");
	    int add1=addition.nextInt();
	    System.out.println("Enter second number");
	    int add2=addition.nextInt();
	    System.out.println(add1 + "+" + add2 + "=" + (add1+add2));
	    break;
	case 2:
	    Scanner subtraction=new Scanner(System.in);
	    System.out.println("Enter first number");
	    int sub1=subtraction.nextInt();
	    System.out.println("Enter second number");
	    int sub2=subtraction.nextInt();
	    System.out.println(sub1 + "-" + sub2 + "=" + (sub1-sub2));
	    break;
        case 3:
            Scanner multiplication=new Scanner(System.in);
            System.out.println("Enter first number");
            int mul1=multiplication.nextInt();
            System.out.println("Enter second number");
            int mul2=multiplication.nextInt();
            System.out.println(mul1 + "*" + mul2 + "=" + (mul1*mul2));
            break;
        case 4:
            Scanner division=new Scanner(System.in);
            System.out.println("Enter first number for addition");
            int div1=division.nextInt();
            System.out.println("Enter second number for addition");
            int div2=division.nextInt();
            System.out.println(div1 + "/" + div2 + "=" + (div1/div2));
            break;
        }    
	s1.close();	
    }

}
