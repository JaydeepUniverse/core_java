package operators;
import java.util.Scanner;

public class MathClass {
    private int c;
    
    public void addition(int a, int b) {
	c = a + b;
	System.out.println("a + b = " + c);
    }
    
    public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter two number : ");
	int a1 = s1.nextInt();
	int b1 = s1.nextInt();
	
	MathClass m1 = new MathClass();
	m1.addition(a1, b1);
	s1.close();
    }
}
