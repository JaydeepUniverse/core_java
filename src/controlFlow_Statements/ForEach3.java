package controlFlow_Statements;

public class ForEach3 {
    public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	
	for (int i : a) {
	    i = i * 10;
	    System.out.println(i);
	}
	
	for (int i : a)
	    System.out.print(i); // No effect on actual value of array's elements, though in above loop calcualted them
    }
}