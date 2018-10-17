package encapsulationDemo;

public class Student {
    private int rollno;
    private String name;
    private double marks;

    public void setRollno(int rollno) {
      this.rollno=rollno;
    }
    public int getRollno() {
      return rollno;
    }

    public void setName(String name) {
      this.name=name;
    }
    public String getName() {
      return name;
    }

    public void setMarks(double marks) {
      this.marks=marks;
    }
    public double getMarks() {
      return marks;
    }

    public Student(){

    }

    public Student(int rollno, String name, double marks){
      this.rollno = rollno;
      this.name = name;
      this.marks = marks;
    }

    public void printDetails(){
      System.out.println(rollno);
      System.out.println(name);
      System.out.println(marks);
    }

}
