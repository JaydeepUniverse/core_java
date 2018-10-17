package exception_handling;

public class NestedTryCatch {
    public static void main(String[] args) {
	try {
	    try {
		int a = 10;
		int c = a / 0;
		System.out.println(c);
	    } catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println();
		System.out.println("Code After c = 10/a");
	    }
	    System.out.println("First Line");
	    try {
		String str = null;
		System.out.println(str.length());
	    } catch (NullPointerException e) {
		System.out.println(e);
		System.out.println();
		System.out.println("Code after String str = null");
	    }
	    System.out.println("Second line");
	    try {
		int arr[] = new int[5];
		arr[6] = 7;
		System.out.println(arr[6]);
	    } catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println();
		System.out.println("Code after arr[]");
	    }
	    try {
		String s = "Hello";
		int a = Integer.parseInt(s);
	    } catch (NumberFormatException e) {
		System.out.println(e);
		System.out.println();
		System.out.println("Code after string hello");
	    }
	} catch (Exception e) {
	    System.out.println(e);
	    System.out.println();
	    System.out.println("Rest of the code");
	}
	System.out.println();
	System.out.println("Print after parent try catch block");
    }
}
