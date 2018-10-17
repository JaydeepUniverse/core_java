package controlFlow_Statements;

public class ForDiamond {
  public static void main(String[] args) {
    int k = 4;

    for(int i=0; i<5; i++){
      for(int j=0; j<k; j++){
        System.out.print("* ");
      }
      k--;
      for(int j=0; j<=i; j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }

}
