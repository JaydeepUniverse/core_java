package controlFlow_Statements;

public class SwitchWithString{
    public static void main(String[] args) {
	String str = "two";
	
	switch(str) {
	case "one":
	    System.out.println("one");
	    break;
	case "two":
	    System.out.println("two");
	    break;
	case "three":
	    System.out.println("three");
	default:
	    System.out.println("not matching");
	}
    }
}