package METHOD;

public class example {

	public static void main(String[] args) {
		test1();
		
		//object - instance of class
		//how to create object of class
		
		//class_name obj_name = new class_name();
		example ex = new example();
		ex.test2();
		ex.division();
	}
	
	//Syntax:
	//access_specifier return_type method-name(){
	//  method body
    //}
	
	//public -> access specifier : visible throughout project
	//static -> keyword
	//void -> return type : it returns nothing
	
	public static void test1() {//static regular method
		System.out.println("good night");
	}
	
	public void test2() {//non static regular method
		System.out.println("good night");
	}
	
	public void division() {
		int a = 100;
		int b = 20;
		System.out.println("Division:"+(a/b));//5
	}
}
