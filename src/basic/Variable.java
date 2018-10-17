package basic;

public class Variable {
    public static void main(String[] args) {
	// VARIABLE DECLARATION EXAMPLE 1
	int a = 2;
	int b = a * 2;
	int c = 10;
	int d = 5;
	int e = 5;
	int f = 5;
	System.out.println("Hello World a=" + a + " b=" + b + " c=" + c + " d=" + d + " e=" + e + " f=" + f);
	System.out.println();
	
	//VARIABLE DECLARATION EXAMPLE 2
	int x, y, z;
	x = y = z = 1;
	int p = 3, q, r = 4;
	q = 1;
	byte z1 = 21;
	double pi = 3.1416;
	char c1 = 'x';
	
	System.out.println(x + "" + y + "" + z + "" + p + "" + q + "" + r + "" + z1 + "" + pi + "" + c1);
	
	//VARIABLE DECLARATION EXAMPLE 3 - DYNAMIC DECLARATION
	double a1 = 3.0, b1 = 4.0;
	double d1 = Math.sqrt(a1*a1 + b1*b1); // d1 is dynamically initialized variable
	System.out.println("Hypotenuse is " + d1);
	System.out.println();
	
	// SCOPE OF VARIABLE
	int aa = 2;
	if (aa == 2) {
	    int y1 = 3;
	    System.out.println("aa variable's value is " + aa + " y1 variable's value is " + y1);
	    aa = aa * 2;
	}
	// y1 = 2; // here y1 variable is not known
	// aa still present here
	System.out.println("new value of aa is " + aa);
	System.out.println();
	
	// LIFE OF THE VARIABLE
	int a2;
	for(a2=0; a2<3;a2++) {
	    int y1 = -1; // y1 is initialized each time block is entered
	    System.out.println("y1 is " + y1);
	    y1 = 100;
	    System.out.println("y1 is now " + y1);
	}
    }
}
