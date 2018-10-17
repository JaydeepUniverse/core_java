package multithreading;

public class Sleep1 extends Thread {
    @Override
    public void run() {
	for (int i = 0; i < 5; i++) {
	    System.out.println("Sleep 1 Class");
	    try {
		Thread.sleep(500);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }
}
