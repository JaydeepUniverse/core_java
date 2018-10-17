package array;

public class CallByVal {
    private int day;
    private int month;
    private int year;
    
    public CallByVal(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
    }

    @Override
    public String toString() {
	return "CallByVal [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    
    public static void swap(CallByVal d1, CallByVal d2) {
	CallByVal temp = d1;
	d1 = d2;
	d2 = temp;
	// If want to have actual output then call below print from within method
	//System.out.println(d1);
	//System.out.println(d2);
    }
}
