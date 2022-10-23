//make an array with user inputs of size 10
//then print all even numbers in an array :
package array;

import java.util.Scanner;

public class evenNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] sack = new int[10];
		// int n=sack.length;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter elements ::");
			sack[i] = sc.nextInt();

		}
		for (int i = 0; i < 10; i++) {

			System.out.print(sack[i] + " ");

		}
		System.out.println();
		System.out.println("Even numbers from array elements : ");
		for (int i = 0; i < 10; i++) {
			if (sack[i] % 2 == 0) {
				System.out.print(sack[i] + " ");
			}
		}
	}
}
