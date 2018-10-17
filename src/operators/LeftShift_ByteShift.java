package operators;

public class LeftShift_ByteShift{
    public static void main(String[] args) {
	byte a = 64;
	byte b;
	int i;
	
	i = a << 2;
	b = (byte) (a << 2);
	System.out.println(i + " " + b);
	/*Since a is promoted to int for the purposes of evaluation, left-shifting the value 64
	(0100 0000) twice results in i containing the value 256 (1 0000 0000). However, the value
	in b contains 0 because after the shift, the low-order byte is now zero. Its only 1 bit has been
	shifted out.*/
    }
}