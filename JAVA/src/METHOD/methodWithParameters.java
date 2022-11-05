package METHOD;

public class methodWithParameters {

	public static void main(String[] args) {
		methodWithParameters mp = new methodWithParameters();
		mp.multiplication(50, 30);
		mp.addition("s", 10);
	}
	
	public void multiplication(int a, int b) {//method with parameter
		System.out.println("Multiplication:"+(a*b));//1500
	}
	
	public void addition(String s, int i) {
		System.out.println("Addition");
	}
}
