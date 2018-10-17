// call this program from StaticEx_Employee2.java
package constructor;

public class StaticEx_Employee1 {
    private int id;
    private String name;
    private double salary;
    private static String companyname;
    private static int count;
    static {
	companyname = "mind";
	count=0;
    }
    
    public StaticEx_Employee1(String n, double s) {
	this.id = count++;
	this.name = n;
	this.salary = s;
    }
    
    public void printDetails() {
	System.out.println("employee id " + id);
	System.out.println("name " + name);
	System.out.println("salary "+ salary);
	System.out.println("company name" + StaticEx_Employee1.companyname);
	System.out.println("***************");
	System.out.println();
    } 
    
   /* public static void main(String[] args) {
	StaticEx_Employee1 e1 = new StaticEx_Employee1("t1", 100);
	StaticEx_Employee1 e2 = new StaticEx_Employee1("t2", 200);
	StaticEx_Employee1 e3 = new StaticEx_Employee1("t3", 300);
	e1.printDetails();
	e2.printDetails();
	e3.printDetails();
    }
    */
}
