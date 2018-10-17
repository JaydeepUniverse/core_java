package data_type;

public class CharacterDataType {
    public static void main(String[] args) {

	// CHARACTER DATA TYPE EXAMPLE 1
	char char1, char2;
	char1 = 88; // code for x
	char2 = 'Y';
	System.out.println("char1 is " + char1 + " and " + "char2 is " + char2);
	System.out.println();
	
	// CHARACTER DATA TYPE EXAMPLE 2
	char char3;
	char3 = 'x'; // double inverted comma would give error while using for char data type
	System.out.println("char3 value is " + char3);
	char3++; /* In the formal specification for Java, char is referred to as an integral type, which means that it is
                    in the same general category as int, short, long, and byte. However, because its principal use is for
                    representing Unicode characters, char is commonly considered to be in a category of its own. */
	System.out.println("char3's value after char3++ is " + char3);
    }
}
