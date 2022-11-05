package METHOD;

public class staticMethodCallFromSameClass {

	public static void main(String[] args) {
		addition();
		
		//square root of no
		//int a = 100;
		//System.out.println(Math.sqrt(a));
	}
	
	public static void addition() {
		int a = 20;
		int b = 30;
		System.out.println("Addition:"+(a+b));
	}
	
}
