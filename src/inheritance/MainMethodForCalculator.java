package inheritance;

public class MainMethodForCalculator {
  public static void main(String[] args){
    Addition a = new Addition(1, 3);
    Subtraction s = new Subtraction(2, 4);
    Multiplication m = new Multiplication(4, 5);
    a.add();
    s.sub();
    m.mul();
  }

}
