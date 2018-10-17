package polymorphism;

public class ChildCommerce extends ParentStudent {
    int commerceFees;
    
    ChildCommerce(int rollno, String name, double basicFees, String stream){
	super(rollno, name, basicFees);
	this.stream = stream;
    }
    
    @Override
    double calculateFees() {
	return fees = super.calculateFees() + 50;
    }
}
