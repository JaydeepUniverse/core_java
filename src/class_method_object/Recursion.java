package class_method_object;

public class Recursion {
    int fact(int i) {
	int result;
	
	if(i==1)
	    return 1;
	result = fact(i-1) * i;
	return result;
    }
 
    public static void main(String[] args) {
	Recursion a = new Recursion();
	
	System.out.println(a.fact(3));
	System.out.println(a.fact(4));
	System.out.println(a.fact(5));
 }
}

