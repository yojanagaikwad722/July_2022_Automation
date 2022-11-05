package Constructor;

public class example1 {

	public static void main(String[] args) {
		example1 ex1 = new example1();//calling constructor
		ex1.example1();//calling method
	}
	
	example1(){//constructor
		System.out.println("calling constructor from same class");
	}
	
	public void example1() {//method
		System.out.println("calling method from same class");
	}
}
