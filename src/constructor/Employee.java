package constructor;

public class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;

    
    public Employee(int id, String name, double basicSalary) {
	this.id = id;
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
   
    public static void main(String[] args) {
	Employee e1 = new Employee(1, "a", 1000);
	e1.calculateSalary();
	e1.printDetails();
    }
}
