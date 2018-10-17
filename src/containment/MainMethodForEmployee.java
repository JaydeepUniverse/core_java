package containment;

public class MainMethodForEmployee {
    public static void main(String[] args) {
      Date d1 = new Date(2,3,2018);
      Employee e1 = new Employee("Normal Employee 1", 100, d1);
      e1.calculateSalary();
      e1.printDetails();
      Date d2 = new Date(2,3,2018);
    	Employee e2 = new Employee("Normal Employee 2", 200, d2);
      e2.calculateSalary();
      e2.printDetails();
      Date d3 = new Date(2,3,2018);
    	Employee e3 = new Employee("Normal Employee 3", 300, d3);
      e3.calculateSalary();
      e3.printDetails();

      Date d4 = new Date(2,3,2018);
      SalesPerson s1 = new SalesPerson("SalesPerson 1", 100, 100, d4);
      s1.calculateSalary();
      s1.printDetails();

      Date d5 = new Date(2,3,2018);
      Manager m1 = new Manager("Manager 1", 1000, 10, d5);
      m1.calculateSalary();
      m1.printDetails();
    }
}
