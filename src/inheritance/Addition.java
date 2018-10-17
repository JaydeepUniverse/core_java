package inheritance;

public class Addition {
    protected int a;
    protected int b;

    public Addition(int a, int b){
      this.a = a;
      this.b = b;
    }

    public void add(){
      System.out.println("Addition " + (a + b));
    }

}
