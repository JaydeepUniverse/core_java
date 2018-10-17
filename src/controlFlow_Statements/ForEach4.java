package controlFlow_Statements;

public class ForEach4 {
    public static void main(String[] args) {
	int a[][] = new int[3][5];
	int sum = 0;
	
	for(int i=0; i<3; i++)
	    for(int j=0; j<5; j++)
		a[i][j] = (i+1) * (j+1);
	
	for (int x[] : a) { //Notice how x is declared. It is a reference to a one-dimensional array of integers. This is necessary because each iteration of the for obtains the next array in nums, beginning with the array specified by nums[0]. The inner for loop then cycles through each of these arrays, displaying the values of each element.
	    for (int b : x) {
		System.out.println("Elements are : " + b);
		sum += b;
	    }
	}
	
	System.out.println("Summation : " + sum);
    }
}
