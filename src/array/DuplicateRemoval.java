package array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRemoval {
    public static int DuplicateEntryRemove(int arr[], int n){
	if(n==0 || n==1) {
	    return n;
	}
	int k = 0;
	for(int i=0; i<n-1; i++) {
	    if(arr[i] != arr[i+1]) {
		arr[k++] = arr[i];
	    }
	}
	arr[k++] = arr[n-1];
	return k;
    }
    
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of array");
	int i=s.nextInt();

	int a[]=new int[i];
	System.out.println("Enter the same size of elements");
	for(int j=0; j<a.length; j++) {
	    a[j] = s.nextInt();
	}
	Arrays.sort(a);
	
	int r=DuplicateEntryRemove(a, a.length);
	System.out.println("After removing duplicate entry, new array is ");
	for(int p=0; p<r; p++) {
	    System.out.println(a[p] + " ");
	}
	s.close();
    }
}
