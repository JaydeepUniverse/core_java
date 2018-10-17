package constructor;

public class Employee_id_count {
    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;
    private static int count;
    static {
	count = 1;
    }

    
    public Employee_id_count(String name, double basicSalary) {
	this.id = count++;
	this.name = name;
	this.basicSalary = basicSalary;
	this.hra = 0.50 * basicSalary;
	this.pt = 200;
	this.pf = 0.12 * basicSalary;
	this.medical = 0.10 * basicSalary;
    }
    
    public void calculateSalary() {
	this.grossSalary = this.basicSalary + this.hra + this.medical;
	this.netSalary = this.grossSalary - (this.pt + this.pf);
    }
    
    public void printDetails() {
	System.out.println("Employee Details : ");
	System.out.println("id : " + id);
	System.out.println("name : "+ name);
	System.out.println("Net Salary :  " + netSalary);
	System.out.println("Gross Salary : " + grossSalary);
	System.out.println();
    }
    
    public static void totalEmp() {
	System.out.println("total employee" + (count-1));
    }
   
    public static void main(String[] args) {
	Employee_id_count e1 = new Employee_id_count("a", 1000);
	e1.calculateSalary();
	e1.printDetails();
	
	Employee_id_count e2 = new Employee_id_count("b", 2000);
	e2.calculateSalary();
	e2.printDetails();
	
	Employee_id_count.totalEmp();
    }
}
