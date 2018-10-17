package exception_handling;

public class InvalidAccountNo extends Exception{
    @Override
    public String toString() {
	return " : Please Enter Valid Account Number";
    }
}
