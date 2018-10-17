package inheritance;

public class Subtraction extends Addition{

  public Subtraction(int a, int b){
      super(a, b);
  }

  public void sub(){
    System.out.println("Subtraction " + (a - b));
  }
}
