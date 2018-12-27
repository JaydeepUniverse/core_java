package basic;

import java.util.Random;

public class Hello {

    public static void main(String[] args) {
	Random rand = new Random(); 
	int value = rand.nextInt(500); 
	System.out.println(value);
      System.out.println("Hello Java!!");
      System.out.println("This is my first java program !");
    }

}
