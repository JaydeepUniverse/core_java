package inheritance;

public class Multiplication extends Subtraction {

  public Multiplication(int a, int b){
      super(a, b);
  }

  public void mul(){
    System.out.println("Multiplication " + (a * b));
  }
}
