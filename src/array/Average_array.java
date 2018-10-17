package array;

class Average_array{
    public static void main(String[] args) {
	double a[] = {10.1, 10.2, 10.3, 10.4, 10.5};
	double average;
	double sum = 0;
	
	for(int i=0; i<a.length; i++)
	    sum = sum + a[i];
	
	average = sum/a.length;
	System.out.println(average);
    }
}