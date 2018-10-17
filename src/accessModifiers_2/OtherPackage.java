package accessModifiers_2;

class OtherPackage {
    OtherPackage(){
	accessModifiers_1.Protection p = new accessModifiers_1.Protection();
	System.out.println("Other Package Constructor");
	// System.out.println("n = " = p.n); // compile time error because n is default variable and only accessible within the package
	// System.out.println("n_pri = " + p.n_pri); // compile time error because private is only accessible package within the class only
	// System.out.println("n_pro = " + p.n_pro); // compile time error because protected only applcable to inherited sub classses
	System.out.println("n_pub = " + p.n_pub);
    }
}
