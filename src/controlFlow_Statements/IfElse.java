package controlFlow_Statements; //package name
import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int p=s1.nextInt();

	if (p%2==0) {
	        System.out.println("No. is Even");
	      }
	      else {
	        System.out.println("No. is Odd");
	      }
      s1.close();
    }
  
}
