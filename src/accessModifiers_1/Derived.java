package accessModifiers_1;

class Derived extends Protection{
    
    Derived(){
	System.out.println("Derived Constructor");
	System.out.println("n = " + n); // accessible due to default
	//System.out.println("n_pri = " + n_pri); // not visible due to private - compile time error
	System.out.println("n_pro = " + n_pro);
	System.out.println("n_pub = " + n_pub);
    }
}
