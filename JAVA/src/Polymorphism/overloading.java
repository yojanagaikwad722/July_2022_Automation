package Polymorphism;

public class overloading {

	public static void main(String[] args) {
		overloading ol = new overloading();
		ol.addition();//90
		ol.addition(20);//110
		ol.addition(20, 30);//50
		ol.addition(45.52f, 56.45f);//101.97
	}
	
	public void addition() {
		int a = 40;
		int b = 50;
		System.out.println("Addition:"+(a+b));
	}
	
	public void addition(int a) {
		int b = 90;
		int c = 10;
		System.out.println("Addition:"+(a+b));
	}
	
	public void addition(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	
	public void addition(float f1, float f2) {
		System.out.println("Addition:"+(f1+f2));
	}
}
