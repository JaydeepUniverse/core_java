package polymorphism;

public class ChildScience extends ParentStudent {
    int scienceFees;
    
    ChildScience(int rollno, String name, double basicFees, String stream){
	super(rollno, name, basicFees);
	this.stream = stream;
    }
    
   @Override
    double calculateFees() {
       return fees = super.calculateFees() + 100;
   }
}
