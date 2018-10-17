package accessModifiers_2;

class Protection2 extends accessModifiers_1.Protection{
    Protection2(){
	System.out.println("Derived other package constructor");
	// System.out.println("n = " = n); // compile time error because n is default variable and only accessible within the package
	// System.out.println("n_pri = " + n_pri); // compile time error because private is only accessible package within the class only
	System.out.println("n_pro = " + n_pro);
	System.out.println("n_pub = " + n_pub);
    }
}
