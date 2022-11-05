package ARRAY;

import java.util.Arrays;

public class example4 {

	public static void main(String[] args) {
		int arr[] = { 20, 10, 45, 43, 68, 100, 60, 28, 30, 128 };// declaration + initialization
		System.out.println(arr[3]);// 43

		System.out.println(arr.length);// 10

		 arr[10] = 300;
		System.out.println(arr);//ArrayIndexOutOfBoundsException

		System.out.println("---Print array info in original order---");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---Print array info in reverse order---");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		System.out.println("---Print array info in ascending order---");
		Arrays.sort(arr);// Ascending order

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---Print array info in descending order---");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}
}
