package class_method_object;

public class Employee {

  private int id;
  private String name;
  private double salary;

  public void initialDetails(int i, String n, double s) {
    id = i;
    name = n;
    salary = s;
    }

  public void printDetails() {
    System.out.println("employee id " + id);
    System.out.println("name " + name);
    System.out.println("salary "+ salary);
    System.out.println("***************");
    System.out.println();
    }

  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.initialDetails(1, "abc", 100);
    e1.printDetails();

    Employee e2 = new Employee();
    e2.initialDetails(2, "pqr", 200);
    e2.printDetails();
    }

}
