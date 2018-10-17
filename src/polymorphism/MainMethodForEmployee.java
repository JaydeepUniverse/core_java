package polymorphism;

public class MainMethodForEmployee {
    public static void main(String[] args) {
      Employee e1 = new Employee("Normal Employee 1", 100);
      e1.calculateSalary();
      e1.printDetails();
    	Employee e2 = new Employee("Normal Employee 2", 200);
      e2.calculateSalary();
      e2.printDetails();
    	Employee e3 = new Employee("Normal Employee 3", 300);
      e3.calculateSalary();
      e3.printDetails();

      SalesPerson s1 = new SalesPerson("SalesPerson 1", 100, 100);
      s1.calculateSalary();
      s1.printDetails();

      Manager m1 = new Manager("Manager 1", 1000, 10);
      m1.calculateSalary();
      m1.printDetails();
    }
}
