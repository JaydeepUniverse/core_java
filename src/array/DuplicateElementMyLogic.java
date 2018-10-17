package array;

import java.util.Scanner;

public class DuplicateElementMyLogic{
    public static void main(String[] args) {
	int a1[] = new int[2];
	int a2[] = new int[2];
	System.out.println("Enter 2 elements");
	Scanner s=new Scanner(System.in);
	
	for(int i=0; i<a1.length; i++) {
	    a1[i] = s.nextInt();
	}
	
	for(int i=0; i<a1.length; i++) {
	    System.out.println(a1[i]);
	}
	
	for(int i=0; i<a1.length; i++) {
	    //int l = a1.length;
	    System.out.println("hi for");
	    if(a1[i] == a1[i+1]) {
		System.out.println("hi if");
		int k[] = new int[a1.length];
		for(int j=0; j<a1.length; j++) {
		    System.out.println("hi for j1");
		   // a2[j] = 
		   // System.out.println("hi1");
		}
		for(int j=0; j<a2.length; j++) {
		    System.out.println("hi for j2");
		    System.out.println(a2[j]);
		}
	    }
	}
	
	s.close();
    }
}
