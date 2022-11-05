package TypesOfVariables;

public class variables {

	int a = 100;//global variable
	static int b = 20;
	
	public static void main(String[] args) {

		variables v = new variables();
		System.out.println(v.a);
		System.out.println(variables.b);
		v.subtraction();
		v.multiplication();
		v.division();
	}

	public void addition() {
		int a = 30;//local variables
		int b = 30;
		System.out.println("Addition:" + (a + b));
	}
	
	private void subtraction() {
		int a = 30;//local variables
		int b = 30;
		System.out.println("Subtraction:" + (a - b));
	}
	
	void multiplication() {
		int a = 30;//local variables
		int b = 30;
		System.out.println("Multiplication:" + (a * b));
	}
	
	protected void division() {
		int a = 30;//local variables
		int b = 5;
		System.out.println("Division:" + (a / b));
	}
}
