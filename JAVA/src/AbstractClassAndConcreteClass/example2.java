package AbstractClassAndConcreteClass;

public class example2 extends example1 {// concrete class
	public static void main(String[] args) {

		example2 ex2 = new example2();
		ex2.m1();
		ex2.m2();
	}

	public void m2() {
		System.out.println("running abstract method in concrete class");
	}

}
