package clone_equals;

public class DateWithEquals implements Cloneable {
    private int day;
    private int month;
    private int year;
    public DateWithEquals(int day, int month, int year) {
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
    @Override
    public boolean equals(Object date) {
	DateWithEquals dt = (DateWithEquals)date;
	if(this.day==dt.day&&this.month==dt.month&&this.year==dt.year) {
	    return true;
	}
	else
	    return false;
    }
    
}
