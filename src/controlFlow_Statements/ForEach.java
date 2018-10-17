package controlFlow_Statements;

public class ForEach {
    public static void main(String[] args) {
	//Before for-each
	
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int b = 0;
	for(int i=0; i<a.length; i++)
	    b += a[i];
	System.out.println(b);
	
	//With for-each
	int c[] = {1,2,3,4,5,6,7,8,9,10};
	int d = 0;
	for(int i : c)
	    d += i;
	System.out.println(d);
    }
}
