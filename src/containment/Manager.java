package containment;

public class Manager extends Employee {
  private int project;
  private double incentive;
  Date doj;

  public Manager(String name, int salary, int project, Date doj){
    super(name, salary, doj);
    this.project = project;
    this.incentive = 0.20 * project;
    this.doj = doj;
  }

  @Override
  public double calculateSalary(){
    System.out.println("You have completed no. of project is " + project + " So, your salary including incentive for project would be as below");
    return this.netsalary = super.calculateSalary() + incentive;
  }
}
