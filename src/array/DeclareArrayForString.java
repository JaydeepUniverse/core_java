package array;

import java.util.Scanner;

public class DeclareArrayForString {
    public static void main(String[] args) {
	String s[] = new String[5];
	System.out.println("Enter : I (enter) Love (enter) My (enter) India");
	Scanner s2=new Scanner(System.in);
	for(int i=0; i<s.length-1; i++) {
	    s[i] = s2.next();
	}
	for(int i=3; i>=0; i--) {
	    System.out.println(s[i]);
	}
	s2.close();
    }
}
