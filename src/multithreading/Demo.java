package multithreading;

public class Demo extends Thread{
    @Override
    public void run() {
	for(int i=0; i<5; i++) {
	    System.out.println("Main class" + i);
	}
    }
}
