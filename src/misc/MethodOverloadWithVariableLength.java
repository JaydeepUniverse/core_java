package misc;

class MethodOverloadWithVariableLength{
    static void variableLength(int ... a) {
	for(int x : a)
	    System.out.print(x + " ");
	System.out.println();
    }
    
    /*static void variableLength(int i, int ... a) {
	for(int x : a)
	    System.out.print(x + " ");
	System.out.println();
    }*/
    //If we remove above comment block , then first calling of the method variableLength(1, 2, 3); would give Ambiguous compile time error. The reason is Does this translate into a call to vaTest(int … a), with three varargs argument, or into a call to     vaTest(int i, int … a) first argument 1 and rest other ? There is no way for the compiler to answer. this question. Thus, the situation is ambiguous.
    
    static void variableLength(String ... b) {
	for(String x : b)
	    System.out.print(x + " ");
	System.out.println();
    }
    static void variableLength(String c, int ... d) {
	System.out.println(c);
	for(int x : d)
	    System.out.print(x + " ");
	System.out.println();
    }
    
    public static void main(String[] args) {
	variableLength(1, 2, 3);
	variableLength("I", "Love", "Java");
	variableLength("Hi", 4, 5, 6);
    }
}