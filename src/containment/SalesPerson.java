package containment;

public class SalesPerson extends Employee {
  private int sale;
  private double incentive;
  Date doj;

  public SalesPerson(String name, double salary, int sale, Date doj){
    super(name, salary, doj);
    this.sale = sale;
    this.incentive = 0.10*sale;
  }

  @Override
  public double calculateSalary(){
    System.out.println("You have return no. of sale is " + sale + " So, your salary including incentive for sale would be as below");
    return this.netsalary = super.calculateSalary() + this.incentive;
  }

}
