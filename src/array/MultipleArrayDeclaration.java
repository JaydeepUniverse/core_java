package array;

class MultipleArrayDeclaration{
    public static void main(String[] args) {
	int[] a, b, c;
	a = new int[2];
	b = new int[3];
	c = new int[4];
	int i, j, k;
	for(i=0; i<a.length; i++)
	    a[i] = i;
	for(j=0; j<b.length; j++)
	    b[j] = j;
	for(k=0; k<c.length; k++)
	    c[k] = k;
	
	for(i=0; i<a.length; i++)
	    System.out.print(a[i] + " ");
	System.out.println();
	for(i=0; i<b.length; i++)
	    System.out.print(b[i] + " ");
	System.out.println();
	for(i=0; i<c.length; i++)
	    System.out.print(c[i] + " ");
	
	// multiple array syntax array declaration used when multiple array needs to declare together
    }
}