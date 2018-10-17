package misc;

class VariableLengthAfterThreePeriods2{
    static void variableLength(int a, String b, double ... c) {
	System.out.println("First int argument value : " + a);
	System.out.println("Second string argument value : " + b);
	System.out.println("Last double variable length argument values length : " + c.length);
	
	for(int i=0; i<c.length; i++)
	    System.out.print(c[i] + " ");
	System.out.println("\n");
    }
    
    public static void main(String[] args) {
	variableLength(1, "A", 1,2,3);
	variableLength(2, "B", 1,2);
	variableLength(3, "C");
    }
    
    // variable length argument in method can be used with regular fixed argument but it has to be in the last - for obvious reason - below syntax is invalid
    // static void variableLength(int a, int...b, int c) - its compile time error
}