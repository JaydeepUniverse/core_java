package controlFlow_Statements;

public class ForEach5 {
    public static void main(String[] args) {
	int a[] = {6,8,9,5,3,4};
	int c = 5;
	boolean b = false;
	
	for(int i : a) {
	    if(i==c) {
		b = true;
		break;
	    }
	}
	
	if(b)
	    System.out.println("Found");
    }
}
