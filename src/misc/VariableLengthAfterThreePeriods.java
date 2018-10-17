package misc;

class VariableLengthAfterThreePeriods{
    static void variableLength(int...v) {
	System.out.println("Variable array length is " + v.length);
	
	for(int i=0; i<v.length; i++)
	    System.out.print(v[i] + " ");
	System.out.println();
    }
    
    /*static void variableLength(boolean...v) {
	System.out.println("Variable array length is " + v.length);
	
	for(int i=0; i<v.length; i++)
	    System.out.print(v[i] + " ");
	System.out.println();
    }*/
    // If we remove above comment block , then last calling of the method variableLength(); - without any argument would give Ambiguous compile time error. The reason is the vararg parameter can be empty, this call could be translated into a call to     vaTest(int …) or vaTest(boolean …). Both are equally valid. Thus, the call is inherently     ambiguous.
    
    public static void main(String[] args) {
	variableLength(1);
	variableLength(1, 2);
	variableLength(1, 2, 3);
	variableLength();
    }
}