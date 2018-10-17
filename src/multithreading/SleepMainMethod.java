package multithreading;

public class SleepMainMethod {
    public static void main(String[] args) {
	Sleep1 a = new Sleep1();
	Sleep2 b = new Sleep2();
	a.start();
	b.start();
    }
}
