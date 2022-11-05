package Casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// 1 byte -> 2bytes -> 4bytes -> 8bytes
		// byte -> short -> int -> long -> float -> double

		// 1. implicit casting(widening casting-where memory size goes on increasing)
		int a = 10;// 4bytes

		double d = a;//8bytes
		System.out.println(d);//10.0
		
		//2. explicit casting(narrowing casting-where memory size goes on decreasing)
		double d1 = 10.5;//8bytes
		int a1 = (int)d1;//4bytes
		System.out.println(a1);//10

	}
}
