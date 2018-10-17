package controlFlow_Statements;
import java.util.Scanner;

public class Student_NestedIf {
    public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter your marks: ");
	int m=s1.nextInt();
	
	if (m>40){
	    if (m>40 && m<=50) {
		    System.out.println("Third Grade");
		}
	    else {
		if (m>50 && m<=60) {
		    System.out.println("Second Grade");
		}
		else {
		    if (m>60 && m<=70) {
			    System.out.println("First Grade");
			}
		    else {
			System.out.println("Distinction");
		    }
		}
	    }
	}
	else {
	    System.out.println("Fail");
	}
	s1.close();
	
    }

}
