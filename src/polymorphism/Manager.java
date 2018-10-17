package polymorphism;

public class Manager extends Employee {
  private int project;
  private double incentive;

  public Manager(String name, int salary, int project){
    super(name, salary);
    this.project = project;
    this.incentive = 0.20 * project;
  }

  @Override
  public double calculateSalary(){
    System.out.println("You have completed no. of project is " + project + " So, your salary including incentive for project would be as below");
    return this.netsalary = super.calculateSalary() + incentive;
  }
}
