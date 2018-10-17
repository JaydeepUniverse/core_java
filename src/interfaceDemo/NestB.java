package interfaceDemo;

class NestB implements NestA.NestedIf {
    public boolean isNotNegative(int x) {
	return x<0 ? false: true;
    }
}
