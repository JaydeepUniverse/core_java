package constructor;

public class StaticEx_Employee2 {
    public static void main(String[] args) {
	StaticEx_Employee1 e1 = new StaticEx_Employee1("t1", 100);
	StaticEx_Employee1 e2 = new StaticEx_Employee1("t2", 200);
	StaticEx_Employee1 e3 = new StaticEx_Employee1("t3", 300);
	e1.printDetails();
	e2.printDetails();
	e3.printDetails();
    }

}
