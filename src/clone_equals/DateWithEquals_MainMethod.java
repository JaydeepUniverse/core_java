package clone_equals;

public class DateWithEquals_MainMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
	DateWithEquals a = new DateWithEquals(1,2,2000);
	DateWithEquals b = new DateWithEquals(3,4,3000);
	DateWithEquals c = (DateWithEquals) a.clone();
	DateWithEquals d = new DateWithEquals(1,2,2000);
	
	System.out.println(a);
	System.out.println(d);
	if(a.equals(d)) {
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
