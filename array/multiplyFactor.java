/* make an array with user inputs of size 10. 
 * then take multiplying factor as 'd' from user. 
 * print the array, with all numbers, multiplied by multiplying factor"
 */
package array;

import java.util.Scanner;

public class multiplyFactor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] tron = new int[10];

		System.out.println("Enter elements :");
		for (int i = 0; i < 10; i++) {
			tron[i] = sc.nextInt();

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(tron[i] + " ");
		}
		System.out.println();
		System.out.println("Enter Multiplying factor :");
		int d = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.print(tron[i] * d + " ");
		}

	}
}
