package interfaceDemo;

public class AnotherClientMain {
    public static void main(String[] args) {
	CallBack c = new ClientForCallBackInterface();
	AnotherClient a = new AnotherClient();
	c.callBack(21);
	c = a; // As you can see, the version of callback( ) that is called is determined by the type of object that c refers to at run time.
	c.callBack(3);
    }
}
