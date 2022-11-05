package Constructor;

public class TestExample3 {

	public static void main(String[] args) {
		example3 ex1 = new example3();
		ex1.multiplication();// 0

		example3 ex2 = new example3(20, 20);
		ex2.multiplication();// 0
		
		example3 ex3 = new example3(10, 20, 30);
		ex3.multiplication();//6000
	}
}
