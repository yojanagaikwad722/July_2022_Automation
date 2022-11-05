package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class example1 {

	public static void main(String[] args) {
		// int a = 10/0;
		// System.out.println(a);//ArithmeticException: / by zero

		// try, catch, finally
		int a;
		try {
			a = 10 / 0;// risky code
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception found");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index of out of bounds exception found");
		} catch (Exception e) {
			System.out.println("exception found");
		} finally {
			System.out.println("finally block always gets executed");
		}
		
		example1 ex1 = new example1();
		ex1.m1();

	}

	public void m1() {
		if(0>-1) {//true
			throw new ArithmeticException("exception found");
		}
	}
	
	public void m2() throws FileNotFoundException,IOException, ArithmeticException {
		FileInputStream file = new FileInputStream("abc.txt");
	}
}
