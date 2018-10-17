// Program Logic is Wrong, Correct it
// Pre-Defined Number
package controlFlow_Statements;

public class PrimeNumber1{
    public static void main(String[] args) {
	int a = 13;
	int b;
	int c=0;
	
	for(b=2; b<a; b++) {
	    if((a%b) == 0) {
		System.out.println("Number is Not Prime");
	    }
	    else {
		c = 1;
	    }
	}
	
	if(c==1) {
	    System.out.println("Number is Prime");
	}
    }
}