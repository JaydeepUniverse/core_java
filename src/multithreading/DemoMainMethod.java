package multithreading;

public class DemoMainMethod {
    public static void main(String[] args) {
	Demo a = new Demo();
	a.start();
	a.run();
	for(int i=0; i<5; i++) {
	    System.out.println("From Main Method" + i);
	}
    }
}
// here Demo class's for loop run two times because start is also calling run automatically that start means thread got started to run mode
// and we're explicitly callling another run method thats's why printing second time
// to don't run second time for loop put comment infront of 
