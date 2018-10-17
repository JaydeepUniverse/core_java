package class_method_object;

class Stack1 {
    private int a[] = new int[10];
    private int b;
    
    Stack1() {
	b = -1;
    }
    void push(int i) {
	if(b==9)
	    System.out.println("Stack Overflow");
	else
	    a[++b] = i;
    }
    int pull() {
	if(b<0) {
	    System.out.println("Stack Underflow");
	    return 0;
	}
	else
	    return a[b--];
    }
}

class AccessModifier_stack{
    public static void main(String[] args) {
	Stack1 a = new Stack1();
	Stack1 b = new Stack1();
	
	for(int i=0; i<10; i++)
	    a.push(i);
	for(int i=10; i<20; i++)
	    b.push(i);
	
	for(int i=0; i<10; i++)
	    System.out.println(a.pull());
	for(int i=0; i<10; i++)
	    System.out.println(b.pull());
	
	//a.b = 2; it will give error b is not visible in compile time because be is private
	//b.a[1] = 3; // of that class and can be accessed by its method only, same for b.a[1]
    }
}

