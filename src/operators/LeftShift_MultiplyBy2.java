package operators;

public class LeftShift_MultiplyBy2{
    public static void main(String[] args) {
	int i;
	int num = 0xFFFFFFE;
	
	for(i=0; i<4; i++) {
	    num = num << 1;
	    System.out.println(num);
	}
	
	/*The starting value was carefully chosen so that after being shifted left 4 bit positions, it
	would produce –32. As you can see, when a 1 bit is shifted into bit 31, the number is
	interpreted as negative.*/
    }
}