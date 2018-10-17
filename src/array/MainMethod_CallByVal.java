package array;

public class MainMethod_CallByVal {
    public static void main(String[] args) {
	CallByVal d1=new CallByVal(2, 3, 2018);
	CallByVal d2=new CallByVal(3, 2, 2017);
	System.out.println("Before Swap");
	System.out.println(d1);
	System.out.println(d2);
	System.out.println("After Swap");
	CallByVal.swap(d1, d2);
	System.out.println(d1); // This won't give output because d1, d2 would not give output outside of local method
	System.out.println(d2);
    }
}
