package INTERFACE;

public class ImplementationClass implements I1, I2 {

	public void m3() {
		System.out.println("running m3 method");
	}

	public void m4() {
		System.out.println("running m4 method");
	}

	public void m1() {
		System.out.println("running m1 method");
	}

	public void m2() {
		System.out.println("running m2 method");
	}
	
	public static void main(String[] args) {
		ImplementationClass ic = new ImplementationClass();
		ic.m1();
		ic.m2();
		ic.m3();
		ic.m4();
	}

}
