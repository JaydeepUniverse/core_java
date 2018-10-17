package constructor;

public class ConstructorEx {

    private int day;
    private int month;
    private int year;

    public ConstructorEx() {
      day = 1;
      month = 12;
      year = 2000;
    }

    public ConstructorEx(int d) {
      this();
      day = d;
    }

    public ConstructorEx(int d, int m) {
	this(d);
	month = m;
    }

    public ConstructorEx(int d, int m, int y) {
	this(d, m);
	year = y;
    }


    public void printDetails() {
	System.out.println("Day : " + day);
	System.out.println("Month : " + month);
	System.out.println("Year : " + year);
	System.out.println("==============");
    }

    public static void main(String[] args) {
	ConstructorEx c1 = new ConstructorEx();
	ConstructorEx c2 = new ConstructorEx(2);
	ConstructorEx c3 = new ConstructorEx(3, 4);
	ConstructorEx c4 = new ConstructorEx(6, 5, 2018);
	c1.printDetails();
	c2.printDetails();
	c3.printDetails();
	c4.printDetails();
    }

}
