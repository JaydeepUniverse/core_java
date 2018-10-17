package class_method_object;

public class BoxMainMethod {
   public static void main(String[] args) {
       Box a = new Box();
       double vol;
       
       a.width = 10;
       a.height = 20;
       a.depth = 15;
		
       vol = a.height * a.width * a.depth;
		
       System.out.println("Volume of Box 1 is " + vol);
       // MULTIPLE OBJECTS HAVE NO EFFECT OF THEIR INSTANCE VARIABLES WITH OTHER OBJECTS
       Box b; // Declare reference to Object
       b = new Box(); // Allocate a Box object
       b.width = 3;
       b.height = 6;
       b.depth = 9;
       
       vol = b.height * b.width * b.depth;
       
       System.out.println("Volume of Box 2 is " + vol);
   }
}
