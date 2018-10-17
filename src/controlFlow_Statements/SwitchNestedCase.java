package controlFlow_Statements;

public class SwitchNestedCase{
    public static void main(String[] args) {
	int count = 2;
	
	switch(count) {
		case 1:
		case 2:
		    int target = 1;
		    switch(target) {
		    	case 0:
		    	case 1:
		    	    System.out.println("print one");
		    	    break;
		    }
		    System.out.println("print two");
		    break;
		default:
		    System.out.println("print nothing");
	}
    }
}