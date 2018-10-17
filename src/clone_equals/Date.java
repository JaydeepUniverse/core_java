package clone_equals;

public class Date implements Cloneable {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
    }
    @Override
    public String toString() {
	return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
	return super.clone();
    }
    
}
