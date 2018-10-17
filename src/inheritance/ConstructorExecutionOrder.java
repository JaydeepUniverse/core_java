package inheritance;

class A2{
    A2(){
	System.out.println("A constructor");
    }
}

class B2 extends A2{
    B2(){
	System.out.println("B constructor");
    }
}

class C2 extends B2{
    C2(){
	System.out.println("C constructor");
    }
}

class ConstructorExecutionOrder{
    public static void main(String[] args) {
	C2 a = new C2();
    }
}