package AbstractClassAndConcreteClass;

public abstract class example1{//abstract class-incomplete class
	
	//abstract class -> incomplete class -> we can't create object of abstract class
	
	//abstract class -> abstract methods(incomplete methods) + non-abstract methods(complete methods)
	
	public void m1() {//non-abstract method/complete method -> declaration + definition
		System.out.println("running m1 method");
	}
	
	public abstract void m2();//abstract/incomplete method -> declaration
	
	public static void m3() {
		System.out.println("running static method");
	}
	
	//public abstract static void m4();

}
