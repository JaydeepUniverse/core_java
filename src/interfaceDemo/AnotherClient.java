package interfaceDemo;

class AnotherClient implements CallBack {
    public void callBack(int p) {
	System.out.println("Another client class");
	System.out.println("p squared is " + (p*p));
    }
}
