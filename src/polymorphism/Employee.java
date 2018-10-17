package polymorphism;

public class Employee {
    private int id;
    private String name;
    protected double basicsalary;
    protected double netsalary;
    private static String companyname;
    protected double pf;
    private static int count;
    static {
      companyname = "MindScript";
	    count=0;
    }

    public Employee(String name, double salary) {
      this.id = count++;
      this.name = name;
      this.basicsalary = salary;
      this.pf = 0.12*basicsalary;
    }

    public double calculateSalary(){
      return this.netsalary = basicsalary + pf;
    }

    public void printDetails() {
      System.out.println("Employee ID     : " + id);
      System.out.println("Employee Name   : " + name);
      System.out.println("Employee Salary : "+ netsalary);
      System.out.println("Company Name    : " + Employee.companyname);
      System.out.println("******************************************");
    }
}
