package array;

class MultiDimeArrayInitialization{
    public static void main(String[] args) {
	double a[][] = {
		{0*0, 1*0, 2*0, 3*0},
		{0*1, 1*1, 2*1, 3*1},
		{0*2, 1*2, 2*2, 3*2},
		{0*3, 1*3, 2*3, 3*3},
	};
	int i, j;
	for(i=0; i<4; i++) {
	    for(j=0; j<4; j++) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
	//As per above program, multi-dimensional program can be initialized, even expressions are allowed while initialization. Also literal values allowed as done for the 4th row and column as done for the below program
	
	int b[][] = {
		{1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 10, 11, 12},
		{13, 14, 15, 16},
	};
	int p, q;
	for(p=0; p<4; p++) {
	    for(q=0; q<4; q++) {
		System.out.print(b[p][q] + " ");
	    }
	    System.out.println();
	}
    }
}