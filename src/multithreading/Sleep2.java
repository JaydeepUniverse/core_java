package multithreading;

public class Sleep2 extends Thread {
    @Override
    public void run() {
	for (int i = 0; i < 5; i++) {
	    System.out.println("Sleep 2 Class");
	    try {
		Thread.sleep(500);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }
}
