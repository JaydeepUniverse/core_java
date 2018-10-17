package controlFlow_Statements;

import java.util.Scanner;

public class DoWhileMenuSelection {
    public static void main(String[] args) {
	int choice;
	Scanner s=new Scanner(System.in);
	
	do {
	    System.out.println("Help on :");
	    System.out.println("1. if");
	    System.out.println("2. switch");
	    System.out.println("3. while");
	    System.out.println("4. do-while");
	    System.out.println("5. for");
	    System.out.println("Choose one : ");    
	    choice = s.nextInt();
	    
	} while(choice < 0);
	
	System.out.println("\n");
	
	switch(choice) {
		case 1:
		    System.out.println("If Statement :");
		    System.out.println("if(condition) statement;");
		    System.out.println("else statement;");
		    break;
		case 2:
		    System.out.println("Switch Statement :");
		    System.out.println("switch (expression){");
		    System.out.println("   case constant:");
		    System.out.println("      statement;");
		    System.out.println("      break;");
		    System.out.println("    //...");
		    System.out.println(" }");
		    break;
		case 3:
		    System.out.println("While Statement :");
		    System.out.println("while(condition){");
		    System.out.println("    statement;");
		    System.out.println(" }");
		    break;
		case 4:
		    System.out.println("Do-While Statement :");
		    System.out.println("do {");
		    System.out.println("    statement;");
		    System.out.println("} while(condition);");
		    break;
		case 5:
		    System.out.println("For Statement :");
		    System.out.println("for(initialization; condition; iteration){");
		    System.out.println("    statement;");
		    System.out.println(" }");
		    break;
		default:
		    System.out.println("Nothing");
	}
	s.close();
	
    }
}
