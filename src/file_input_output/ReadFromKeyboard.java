package file_input_output;

import java.io.DataInputStream;
import java.io.IOException;

public class ReadFromKeyboard {
    public static void main(String[] args) {
	DataInputStream dis = new DataInputStream(System.in);
	try {
	    System.out.println("Enter Your Name : ");
	    String name = dis.readLine();
	    System.out.println("Enter Your Age : ");
	    int age = Integer.parseInt(dis.readLine());
	    System.out.println("Your Name is : " + name + "\nYour age is : " + age);
	}catch(IOException e) {
	    e.printStackTrace();
	}
    }
}

