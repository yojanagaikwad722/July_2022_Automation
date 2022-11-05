package ARRAY;

public class example1 {

	public static void main(String[] args) {
		// 1. declaration of array
		String arr[] = new String[5];

		// 2. initialization
		arr[0] = "Deepali";
		arr[1] = "Ankita";
		arr[2] = "Pooja";
		arr[3] = "Sanket";
		arr[4] = "Sushil";
		//arr[5] = "quantum";//ArrayIndexOutOfBoundsException
		
		System.out.println(arr[1]);//Ankita
		
		System.out.println(arr.length);//5
		
		System.out.println("---Print all info from Array---");
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}

	}
}
