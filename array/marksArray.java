// array of marks having length 5, print all the input marks in array :
package array;

import java.util.Scanner;

public class marksArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] marks = new int[5];
		
		System.out.println("Enter marks : ");
		for (int i = 0; i < 5; i++) {

			marks[i] = sc.nextInt();

		}
		System.out.print("statement of marks :");
		for (int i = 0; i < 5; i++) {

			System.out.print(marks[i] + " ");
		}
	}

}
