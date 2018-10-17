package controlFlow_Statements;

public class ForEach2 {
    public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int b = 0;
	
	for(int i : a) {
	    b += i;
	    if(i==5)
		break;
	}
	System.out.println(b);
    }
}
