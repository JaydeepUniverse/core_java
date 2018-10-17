package multithreading;

public class DemoUsingInterfaceMainMethod {
    public static void main(String[] args) {
	DemoUsingInterface a = new DemoUsingInterface();
	Thread b = new Thread(a);
	b.start();
	for(int i=0; i<5; i++) {
	    System.out.println("From Main Method "+ i);
	}
    }
}
