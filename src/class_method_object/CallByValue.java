package class_method_object;

public class CallByValue {
    void meth(int i, int j) {
	i *= 2;
	j /= 2;
    }
    
    public static void main(String[] args) {
	CallByValue a = new CallByValue();
	int b = 15, c = 20;
	
	System.out.println("Before call b : " + b + " c : " + c);
	a.meth(b, c);
	System.out.println("After call b : " + b + " c : " + c);
    }
}
