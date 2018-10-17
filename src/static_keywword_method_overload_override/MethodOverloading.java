package static_keywword_method_overload_override;

public class MethodOverloading {
    /* Below program will throw compile time error for method overloading with same arguments but with different return type
     public void add(int a, int b) {
	System.out.println("Addition of Int Int is " + (a + b));
    }
    
    public void add(float a, float b) {
	System.out.println("Addition of Float Float is " + (a + b));
    }
    
    public void add(int a, float b) {
	System.out.println("Addition of Int Float is " + (a + b));
    }
    
    public static void main(String[] args) {
	MethodOverloading m1 = new MethodOverloading();
	m1.add(1, 2);
	m1.add(1.2, 3.8);
	m1.add(1, 1.5);
    }*/
    
    // other option of method overloading could be possible with diff. arguments
    public void add(int a, int b) {
	System.out.println("Addition of Int Int is " + (a + b));
    }
    
    public void add(int a, int b, int c) {
	System.out.println("Addition of Float Float is " + (a + b + c));
    }
    
    public void add(int a, int b, int c, int d) {
	System.out.println("Addition of Int Float is " + (a + b + c + d));
    }
    
    public void add(int...num) {
	int sum=0;
	for(int i=0; i<num.length; i++) {
	    sum=sum+num[i];
	}
	System.out.println("Addition is " + sum);
    }
    
    public static void main(String[] args) {
	MethodOverloading m1 = new MethodOverloading();
	m1.add(1, 2);
	m1.add(1, 2, 3);
	m1.add(1, 2, 3, 4);
	m1.add(1,2,3,4,5,6,7,8,9,10);
    }
}
