package string;

public class Demo {
    public static void main(String[] args) {
	String s1 = new String("aaa");
	String s2 = new String("bbb");
	s1.concat(s2); // no any operations would perform here
	System.out.println(s1); // value would remain same aaa
	
	String s3 = new String("ppp");
	System.out.println(s3.hashCode());
	String s4 = new String("qqq");
	s3 = s3.concat(s4); // this operations would perform because s3's new object being created
	System.out.println(s3);
	System.out.println(s3.hashCode());
	
	s1 = s1.toUpperCase();
	System.out.println(s1);
	
	//Java defines peer classes of String, called StringBuffer and StringBuilder, which 	allow strings to be altered, so all of the normal string manipulations are still available in Java.
	StringBuffer s5 = new StringBuffer("111");
	StringBuffer s6 = new StringBuffer("222");
	s5.append(s6);
	System.out.println(s5);
    }
}
