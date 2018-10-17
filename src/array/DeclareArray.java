package array;
import java.util.Scanner;

public class DeclareArray{
    public static void main(String[] args) {
	int arr[] = new int[3];
	System.out.println("Type 3 values");
	Scanner s1 = new Scanner(System.in);
	for(int i=0; i<arr.length; i++) {
	    arr[i]=s1.nextInt();
	}
	
	System.out.println("Printing above provided array values");
	for(int i=0; i<arr.length; i++) {
	    System.out.println(arr[i]);
	}
	
	System.out.println("Again printing same values with diff. method using for");
	for(int i : arr) {
	    System.out.println(i);
	}
	s1.close();
	
	/* Below program syntax is right but would give error	
	 * because declaration is not inline and proper
	 * This string program is separate in DeclareArrayForString
	 * and the same program with both int and string is in DeclareArrayIntString
  	String s[] = new String[5];
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter : I (enter) Love (enter) My (enter) India");
	for(int i=0; i<s.length-1; i++) {
	    s[i] = s2.next();
	}
	for(int i=3; i>=0; i--) {
	    System.out.println(s[i]);
	}
	s2.close();*/
    }
}