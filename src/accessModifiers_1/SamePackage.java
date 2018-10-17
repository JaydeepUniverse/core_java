package accessModifiers_1;

class SamePackage {
    public SamePackage() {
	Protection p = new Protection();
	System.out.println("SamePackage Constructor");
	System.out.println("n = " + p.n);
	//System.out.println("n_pri = " + p.n_pri); // not visible due to private - compile time error
	System.out.println("n_pro = " + p.n_pro);
	System.out.println("n_pub = " + p.n_pub);
    }
}
