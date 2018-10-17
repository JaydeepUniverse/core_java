package controlFlow_Statements;

public class ConditionStatement {
    public static void main(String[] args) {
	int a = 2;
	int b = a * 2;
	int c = 10;
	int d = 5;
	int e = 5;
	int f = 5;
	
	if (c>d) 
	    System.out.println("c="+ c + " is higher than d=" + d); // example without block, when we have single statement we may use without {}
	
	if(a<b) {
	    System.out.println();
	    System.out.println("a="+ a + " is less than b=" + b); // example of block when we have more then one line we'd need to define in {} block
	    System.out.println();
	}
	
	if (e==f)
	    System.out.println("e="+ e + " is equal to f=" + f);
    }

}
