package interfaceDemo;

public class ClientMain {
    public static void main(String[] args) {
	CallBack c = new ClientForCallBackInterface();
	c.callBack(33);
	//c.nonInterfaceMethod(); // compile time error, as interface reference variable can only point to the its calling implemented method
    }
}
