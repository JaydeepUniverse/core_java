package array;

public class MainMethod_CallByReference {
    public static void main(String[] args) {
	CallByReference arr[] = new CallByReference[2];
	arr[0] = new CallByReference(2, 3, 2018);
	arr[1] = new CallByReference(3, 2, 2017);
	System.out.println("Before Swap");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println("After Swap");
	CallByReference.swap(arr);
	System.out.println(arr[0]);
	System.out.println(arr[1]);
    }
}
