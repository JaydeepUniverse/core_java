package interfaceDemo;

public class Student implements Printable,Showable {
    private int rollno;
    private String name;

    public Student() {
    }

    public Student(int rollno, String name) {
      super();
      this.rollno = rollno;
      this.name = name;
    }

    @Override
    public void print(){
      System.out.println("Student 1 roll no. is " + rollno);
    }

    @Override
    public void show(){
      System.out.println("Student 1 name is " + name);
    }

    public static void main(String[] args) {
	     Student s1=new Student(1, "He");
       s1.print();
       s1.show();
    }

}
