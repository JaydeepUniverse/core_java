package string;

public class StringIntSeparateSum {
    public static void main(String[] args) {
	String s = new String("abcd1234abcd");
	int sum = 0;
	String num="";
	for(int i=0; i<s.length(); i++) {
	    char c = s.charAt(i);
	    //System.out.println(c);
	    if(Character.isDigit(c)){
		num = num + c;
		//System.out.println(num);
		sum = sum + Integer.parseInt(num);
		num="";
	    }
	}
	System.out.println(sum);
    }
}
