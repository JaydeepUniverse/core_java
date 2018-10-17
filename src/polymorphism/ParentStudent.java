package polymorphism;

public class ParentStudent {
    int rollno;
    String name;
    String stream;
    double fees;
    double basicFees;
    
    ParentStudent(int rollno, String name, double fees){
	this.rollno = rollno;
	this.name = name;
	this.fees = fees;
	this.basicFees = (fees * 0.18) + fees;
    }
    
    double calculateFees() {
	return fees = basicFees;
    }
    
    void printDetails() {
	System.out.println("Studnent Roll No. : " + rollno);
	System.out.println("Student name : " + name);
	System.out.println("Student stream : " + stream);
	System.out.println("Student fees for " + stream + " : " + fees);
	System.out.println();
    }
}
