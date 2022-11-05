package Casting;

public class Upcasting {

	public static void main(String[] args) {
		// 1. upcasting
		father s = new son();//create an object of subclass and provide reference of parent class
		//s -> upcasting object
		
		s.Money();//Money:150
		
		//2. downcasting
		son s1 = (son)s;
		s1.Money();
		s1.Mobile();

		
	}
}
