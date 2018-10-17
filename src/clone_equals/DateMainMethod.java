package clone_equals;

public class DateMainMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
	Date a = new Date(1,2,2000);
	Date b = new Date(3,4,3000);
	Date c = (Date) a.clone();
	Date d = new Date(5,6,4000);
	
	System.out.println(a);
	System.out.println(b);
	if(c.equals(a)) {
	    System.out.println("Same");
	}
	else {
	    System.out.println("Not Same");
	}
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
    }
}
