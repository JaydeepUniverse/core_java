package array;

class MultiDimArrayDeclare{
    public static void main(String[] args) {
	// Basic Program
	int a[][] = new int[4][5];
	int i, j, k=0;
	for(i=0; i<4; i++) {
	    for(j=0; j<5; j++) {
		a[i][j] = k;
		k++;
	    }
	}
	for(i=0; i<4; i++) {
	    for(j=0; j<5; j++)
		System.out.print(a[i][j] + " ");
	    System.out.println();
	}
	
	// Second element does not need to define, its under our control to define. When you allocate memory for a multidimensional array, you need only specify the memory for the first (leftmost) dimension. You can allocate the remaining dimensions separately.
	int b[][] = new int[4][];
	b[0] = new int[1];
	b[1] = new int[2];
	b[2] = new int[3];
	b[3] = new int[4];
	int p, q, r=0;
	for(p=0; p<4; p++) {
	    for(q=0; q<p+1; q++) {
		b[p][q] = r;
		r++;
	    }
	}
	for(p=0; p<4; p++) {
	    for(q=0; q<p+1; q++)
		System.out.print(b[p][q] + " ");
	    System.out.println();
	}
    }
}