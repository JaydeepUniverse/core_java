package data_type;

public class BooleanDataType {
    public static void main(String[] args) {
	boolean b1;
	b1 = false;
	System.out.println("b1 boolean variable value is " + b1);
	b1 = true;
	System.out.println("b1 boolean varible Now value is " + b1);
	if(b1)
	    System.out.println("This will be executed because last value of b1 is True");
	b1 = false;
	if(b1)
	    System.out.println("This will not be executed because last value of b1 is False and if works on true condition only");
	System.out.println("10 > 9 is " + (10 > 9));
    }
}
