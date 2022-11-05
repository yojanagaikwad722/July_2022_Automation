package Constructor;

public class defaultConstructor {

	int a;//0
	String name;//null
	float marks;//0
	
	public static void main(String[] args) {
		defaultConstructor dc = new defaultConstructor();
		dc.addition();
	}

	public void addition() {//non static method
		int a = 30;
		int b = 50;
		System.out.println("Addition:" + (a + b));
	}
}
