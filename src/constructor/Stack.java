package constructor;

public class Stack{
    int a[] = new int[10];
    int b;
    
    Stack() {
	b = -1;
    }
    
    void push(int item) {
	if(b==9)
	    System.out.println("Stack is Full");
	else
	    a[++b] = item;
    }
    
    int pull() {
	if(b<0) {
	    System.out.println("Stak Underflow");
	    return 0;
	}
	else
	    return a[b--];
    }
}