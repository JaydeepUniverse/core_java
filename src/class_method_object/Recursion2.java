package class_method_object;

public class Recursion2 {
    int a[];
    
    Recursion2(int i){
	a = new int[i];
    }
    
    void printArray(int i) {
	if(i==0)
	    return;
	else
	    printArray(i-1);
	System.out.println("a[" + (i-1) + "] = " + a[i-1]);
    }
    
    public static void main(String[] args) {
	Recursion2 a = new Recursion2(10);
	
	for(int i=0; i<10; i++)
	    a.a[i] = i;
	
	a.printArray(10);
    }
}
