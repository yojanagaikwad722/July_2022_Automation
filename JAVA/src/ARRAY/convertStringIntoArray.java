package ARRAY;

public class convertStringIntoArray {

	public static void main(String[] args) {
		String s1 = "quantum academy";
		String ar[] = s1.split("a");

		System.out.println(ar[0]);// quantum
		System.out.println(ar[1]);// academy
		System.out.println(ar[2]);
		System.out.println(ar[3]);

		String ar1[] = s1.split("a", 4);
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		
		String s2 = "Quantum Academy";
		char[] charArray=s2.toCharArray();
		
		//for each
		for(char c:charArray) {
			System.out.println(c);
		}

	}
}
