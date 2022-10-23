// WAP to find first index at which element is present :
package arrayPractice;

import java.util.Scanner;

public class firstIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zed[] = new int[5];
		// int n = zed.length;
		// System.out.println(n);

		System.out.println("Enter Elements :");
		for (int i = 0; i < zed.length; i++) {

			zed[i] = sc.nextInt();
			// System.out.println(zed[i]);
		}

		for (int i = 0; i < zed.length; i++) {

			System.out.print(zed[i] + " ");
		}
		// for (int i = 0; i < zed.length; i++) {
		System.out.println();
		System.out.print("First index element :" + zed[0]);
		 
		// }
	}
}
