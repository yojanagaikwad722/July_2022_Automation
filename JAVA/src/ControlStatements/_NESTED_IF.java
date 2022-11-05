package ControlStatements;

public class _NESTED_IF {

	public static void main(String[] args) {
		String UN = "quantum1";
		String PWD = "qa@1234";
		
		if(UN=="quantum") {//true
			System.out.println("correct username");
			if(PWD=="qa@123") {//true
				System.out.println("correct password");
				System.out.println("login successful");
			}else {//fail
				System.out.println("wrong password");
				System.out.println("login failed");
			}
		}else {//fail
			System.out.println("wrong username");
			System.out.println("login failed");
		}
	}
}
