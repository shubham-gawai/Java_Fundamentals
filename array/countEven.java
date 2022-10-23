//make an array with user inputs of size 10
//then print count of all even numbers in an array
package array;

import java.util.Scanner;

public class countEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] sack = new int[10];
		// int n=sack.length;

		System.out.println("Enter elements ::");
		for (int i = 0; i < 10; i++) {

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
				count++;
			}

		}
		System.out.println();
		System.out.println("Total count:");
		System.out.println(count + " ");
//		for (int i = 0; i < 10; i++) {
//		for (int count = 0; count < 10; count++) {
//			if (sack[i] % 2 == 0) {
//				System.out.println(count);
//			 }
//			}

	}
}
