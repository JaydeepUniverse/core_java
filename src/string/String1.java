package string;

class String1{
    public static void main(String[] args) {
	String a = "I";
	String b = "Love";
	String c = "Java";
	String d = a + " " + b + " " + c;
	String e = a;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	// Operations on String
	System.out.println(a.length());
	System.out.println(b.charAt(3));
	if(a.equals(b))
	    System.out.println("a == b");
	else
	    System.out.println("a != b");
	
	if(a.equals(e))
	    System.out.println("a == e");
	else
	    System.out.println("a != e");
	
	// arrays of string
	String f[] = {"one", "two", "three"};
	for(int i=0; i<f.length; i++)
	    System.out.println("str[" + i + "] : " + f[i]);
    }
}