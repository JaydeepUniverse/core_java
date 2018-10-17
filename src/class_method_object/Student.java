package class_method_object;

public class Student {
    private int id;
    private String name;
    private int roll_no;

    public void initialDetails(int i, String n, int r){
      id=i;
      name=n;
      roll_no=r;
    }

    public void printDetails(){
      System.out.println("ID " + id);
      System.out.println("Name "+ name);
      System.out.println("Roll Number "+ roll_no);
    }

    public static void main(String[] args) {
       Student d1=new Student();
       d1. initialDetails(1, "ABC", 1023);
       d1.printDetails();
    }

}
