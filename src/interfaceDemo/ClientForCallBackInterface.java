package interfaceDemo;

class ClientForCallBackInterface implements CallBack {
    public void callBack(int p) {
	System.out.println("callback called with " + p);
    }
    public void nonInterfaceMethod() {
	System.out.println("Non Interface Method, it's class' own method");
    }
}
