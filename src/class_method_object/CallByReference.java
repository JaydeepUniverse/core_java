package class_method_object;

public class CallByReference {
    int a, b;
    
    CallByReference(int i, int j){
	a = i;
	b = j;
    }
    
    void meth(CallByReference k) {
	k.a *= 2;
	k.b /= 2;
    }
    
    public static void main(String[] args) {
	CallByReference a = new CallByReference(15, 20);
	
	System.out.println("Before call a : " + a.a + " b : " + a.b);
	a.meth(a);
	System.out.println("After call a : " + a.a + " b : " + a.b);
    }
}
