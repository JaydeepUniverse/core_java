package finalize;

public class DateMainMethod {
    public static void main(String[] args) {
	Date a = new Date(1,2,2018);
	Date b = new Date(3,4,2017);
	Date c=a;
	
	System.out.println(a);
	System.out.println(b);
	
	if(c==a)
	    System.out.println("Same");
	else
	    System.out.println("Not Same");
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(c.hashCode());
    }
}
