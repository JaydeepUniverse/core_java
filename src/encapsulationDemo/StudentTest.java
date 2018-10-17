package encapsulationDemo;

public class StudentTest {
  public static void main(String[] args) {

    Student s1=new Student();

    s1.setRollno(1);
    s1.setName("Test");
    s1.setMarks(23);

    System.out.println(s1.getRollno() + " " + s1.getName() + " " + s1.getMarks());
  }
}
