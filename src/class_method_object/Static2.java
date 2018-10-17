package class_method_object;

class Test{
    static int a = 1;
    static int b = 2;
    
    static void printDetails() {
	System.out.println(a);
    }
}

class Static2{
    public static void main(String[] args) {
	Test.printDetails(); // Here printDetails is calling in another class so classname.methodname is necessary
	System.out.println(Test.b); // same is for variable as well
    }
}
