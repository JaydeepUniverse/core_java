package interfaceDemo;

public class NestMain {
    public static void main(String[] args) {
	NestA.NestedIf nif = new NestB();
	if(nif.isNotNegative(10))
	    System.out.println("10 is positive, this will display");
	if(nif.isNotNegative(-10))
	    System.out.println("-10 is negative, this won't display");
	
    }
}
