package misc;

class VariableLengthBeforeThreePeriods{
    static void variableLength(int v[]) {
	System.out.println("Length of variable array is " + v.length);
	
	for(int x : v)
	    System.out.print(x + " "); // make sure to use print instead of println while displaying array
	System.out.println();
    }
    
    public static void main(String[] args) {
	int a[] = {1};
	int b[] = {1, 2};
	int c[] = {1, 2, 3};
	int d[] = {};
	
	variableLength(a);
	variableLength(b);
	variableLength(c);
	variableLength(d);
    }
}