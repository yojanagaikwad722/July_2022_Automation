package Constructor;

public class constructorWithoutParameter {

	public static void main(String[] args) {
		constructorWithoutParameter cp1 = new constructorWithoutParameter();
		constructorWithoutParameter cp2 = new constructorWithoutParameter(10);
		constructorWithoutParameter cp3 = new constructorWithoutParameter(10, 'A', "quantum");
	}

	 constructorWithoutParameter() {
		System.out.println("calling constructor without parameter");
	}
	 
	 constructorWithoutParameter(int a){
		 System.out.println("calling constructor with single parameter");
	 }
	 
	 constructorWithoutParameter(int a, char c, String name){
		 System.out.println("calling constructor with three parameters");
	 }

}
