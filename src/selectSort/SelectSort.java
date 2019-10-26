package selectSort;
import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {

		int[] originArray = { 3, 1, 6, 9, 7, 5 };

		for (int j = 1; j < originArray.length; j++) {
			for (int i = 0; i < originArray.length - 1; i++) {

				int smallest = i;
				int temp;
				if (originArray[i] > originArray[j]) {
					smallest = j;
				}

				// Change the positions
				temp = originArray[smallest];
				originArray[smallest] = originArray[i];
				originArray[i] = temp;
			}
		}

		// printing
		for (int i = 0; i < originArray.length; i++) {
			System.out.print(originArray[i]);
		}

	}
	public void setArray() {
		
		Scanner myObj = new Scanner(System.in); 
		//set the array length
		System.out.println("Enter the length of the array:");
		int length = myObj.nextInt(); 
		int []inputArray = new int[length];
		
		//set the array elements
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<length;i++) {
			inputArray[i] = myObj.nextInt();
		}


	}
	public void changePosition() {
		
	}
	public void print() {
		
	}

}
