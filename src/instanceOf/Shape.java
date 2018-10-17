package instanceOf;

public abstract class Shape implements Printable1{
  protected int dia1;
  protected int base;
  protected int height;
  protected double area;
  
  public Shape(int dia1) {
      this.dia1 = dia1;
  }
  
  public Shape(int base, int height) {
      this.base = base;
      this.height = height;
  }
  
  public abstract void area();
  
  @Override
  public void print(){
    System.out.println("Circle area is " + area);
  }
  
}
