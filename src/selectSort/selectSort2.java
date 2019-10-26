package selectSort;

import java.util.Scanner;
import java.util.Random;

public class selectSort2 {

	public static void main(String[] args) {

		int[] myArray = setArray();
		System.out.println("<Original Array>");
		arrayPrint(myArray);

		sorting(myArray);
		System.out.println("\n\n");

		System.out.println("<Sorted Array>");
		arrayPrint(myArray);
	}

	public static int[] setArray() {

		Scanner myObj = new Scanner(System.in);
		Random randomArray = new Random();

		// set the array length
		System.out.println("Enter the length of the array:");
		int length = myObj.nextInt();
		int[] inputArray = new int[length];

		// set the array elements
		for (int i = 0; i < length; i++) {

			// inputArray[i] = myObj.nextInt();
			inputArray[i] = randomArray.nextInt(100);
			// System.out.println(inputArray[i]);
		}

		return inputArray;
	}

	public static void sorting(int x[]) {

		for (int j = 1; j < x.length; j++) {
			for (int i = 0; i < x.length - 1; i++) {

				int smallest = i;
				int temp;
				if (x[i] > x[j]) {
					smallest = j;
				}

				// Change the positions
				temp = x[smallest];
				x[smallest] = x[i];
				x[i] = temp;
			}
		}

	}

	public static void arrayPrint(int[] x) {
		for (int i = 0; i < x.length; i++) {
			int print = x[i];
			System.out.print(print + " ");
		}

	}

	public static void arrayPrint(String[] x) {
		for (int i = 0; i < x.length; i++) {
			String print = x[i];
			System.out.print(print + " ");
		}
	}
}
