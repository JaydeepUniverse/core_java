package array;

public class CallByReference {
    private int day;
    private int month;
    private int year;
    
    public CallByReference(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
    }

    @Override
    public String toString() {
	return "CallByReference [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    
    public static void swap(CallByReference arr[]) {
	CallByReference temp = arr[0];
	arr[0] = arr[1];
	arr[1] = temp;
    }
}

