package array;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number of Row Element");
	int row = s.nextInt();
	System.out.println("Enter Number of Column Element");
	int col = s.nextInt();
	int arr[][] = new int[row][col];
	System.out.println("Enter Elements");
	for(int i=0; i<row; i++) {
	    for(int j=0; j<col; j++) {
		arr[i][j] = s.nextInt();
	    }
	}
	
	for(int i=0; i<row; i++) {
	    for(int j=0; j<col; j++) {
		System.out.print(arr[i][j] + " ");
	    	}
	    System.out.println(" ");
	    }
	s.close();
	}
}
