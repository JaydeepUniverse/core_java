package inheritance;

class A5{
    int a;
    A5(int i){
	a = i;
    }
    void show() {
	System.out.println("class A value of a : " + a);
    }
}

class B5 extends A5{
    int b;
    B5(int i, int j){
	super(i);
	b = j;
    }
    void show(String s) {
	System.out.println("class B value of b : " + b + " " + s);
    }
}

public class MethodOverloadingInIheritance {
    public static void main(String[] args){
	B5 b = new B5(1, 2);
	b.show();
	b.show("Hi");
    }
}
//Method overriding occurs only when the names and the type signatures of the two methods are identical. If they are not, then the two methods are simply overloaded. The version of show( ) in B takes a string parameter. This makes its type signature different from the one in A, which takes no parameters. Therefore, no overriding (or name hiding) takes place. Instead, the version of show( ) in B simply overloads the version of show( ) in A.