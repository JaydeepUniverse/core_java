package constructor;

public class StackMainMethod {
    public static void main(String[] args) {
	Stack a = new Stack();
	for(int i=0; i<10; i++)
	    a.push(i);
	System.out.println("Stack in a :");
	for(int i=0; i<10; i++)
	    System.out.println(a.pull());
	
	Stack b = new Stack();
	for(int j=10; j<20; j++)
	    b.push(j);
	System.out.println("Stack in b :");
	for(int j=0; j<10; j++)
	    System.out.println(b.pull());
    }
}
