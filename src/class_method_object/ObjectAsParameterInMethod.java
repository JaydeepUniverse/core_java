// Match this concept with callbyreference
package class_method_object;

public class ObjectAsParameterInMethod {
    int a, b;
    
    ObjectAsParameterInMethod(int i, int j){
	a = i;
	b = j;
    }
    
    boolean equalTo(ObjectAsParameterInMethod k) {
	System.out.println(k.a);
	System.out.println(k.b);
	System.out.println(this.a);
	System.out.println(this.b);
	if(k.a == a && k.b == b)
	    return true;
	else
	    return false;
    }
    
    public static void main(String[] args) {
	ObjectAsParameterInMethod a = new ObjectAsParameterInMethod(100, 200);
	System.out.println("a " + a.a);
	System.out.println("a " + a.b);
	System.out.println();
	ObjectAsParameterInMethod b = new ObjectAsParameterInMethod(100, 200);
	System.out.println("b " + b.a);
	System.out.println("b " + b.b);
	System.out.println();
	ObjectAsParameterInMethod c = new ObjectAsParameterInMethod(300, 400);
	System.out.println("c " + c.a);
	System.out.println("c " + c.b);
	System.out.println();
	
	System.out.println(a.equalTo(b));
	System.out.println();
	System.out.println(a.equalTo(c));
    }
}
