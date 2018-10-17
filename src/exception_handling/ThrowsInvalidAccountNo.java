package exception_handling;

public class ThrowsInvalidAccountNo extends Exception {
    @Override
    public String toString() {
	return " : Please Enter Valid Account Number";
    }
}
