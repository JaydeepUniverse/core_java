package data_type;

public class DataTypeConversion {
    public static void main(String[] args) {
	byte b;
	int i = 200;
	double d = 323.123;
	
	System.out.println("Conversion of Int to Byte, Current value of Int i is " + i);
	b = (byte)i;
	System.out.println("After coverting to Byte, i is " + b);
	
	System.out.println("\nConversion of Double to Int, Current value of Double d is " + d);
	i = (int)d;
	System.out.println("After converting to Int, d is " + i);
	
	System.out.println("\nCoverstion of Double to Byte, Current value of Double d is " + d);
	b = (byte)d;
	System.out.println("After converting to Byte, d is " + b);
    }
}
