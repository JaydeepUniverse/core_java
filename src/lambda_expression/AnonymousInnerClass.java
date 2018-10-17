package lambda_expression;

public class AnonymousInnerClass {
    public static void main(String[] args) {
	Printable a = () -> {
	    System.out.println("Hi");
	};
	a.print();

    }
}
