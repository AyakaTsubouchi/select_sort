package selectSort;

import java.util.Scanner;
import java.util.Random;

public class selectSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = setArray();
		System.out.println(myArray);
		System.out.println(myArray.length);
		System.out.println("hello");

	}

	public static int[] setArray() {

		Scanner myObj = new Scanner(System.in);
		Random randomArray = new Random();
		
		
		// set the array length
		System.out.println("Enter the length of the array:");
		int length = myObj.nextInt();
		int[] inputArray = new int[length];

		// set the array elements
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < length; i++) {
			
		
			//inputArray[i] = myObj.nextInt();
			inputArray[i] = randomArray.nextInt(10);
			System.out.println(inputArray[i]);

		}
		
		
		return inputArray;
	}

//	public void sorting(int[] x) {
//		int[] originArray = { 3, 1, 6, 2, 7, 5 };
//
//		for (int j = 1; j < originArray.length; j++) {
//			for (int i = 0; i < originArray.length - 1; i++) {
//
//				int smallest = i;
//				int temp;
//				if (originArray[i] > originArray[j]) {
//					smallest = j;
//				}
//			}
//		}
//	}
//
//	public void changePosition() {
//
//	}
//
//	public void print() {
//
//	}
}
