package controlFlow_Statements;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
	int i;
	for (i=0; i<=12; i++) {
	    switch(i) {
	    	case 0:
	    	case 1:
	    	case 2:
	    	    System.out.println("i is less than 3");
	    	    break;
	    	case 3:
	    	case 4:
	    	case 5:
	    	case 6:
	    	case 7:
	    	    System.out.println("i is less than 8");
	    	    break;
	    	case 8:
	    	case 9:
	    	default:
	    	    System.out.println("is is 10 or more");
	    }
	}
    }
}
