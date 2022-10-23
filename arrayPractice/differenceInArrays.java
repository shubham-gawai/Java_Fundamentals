// WAP to difference in two array :
package arrayPractice;

import java.util.Scanner;

public class differenceInArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[a.length];

		// int a[] = { 45, 6, 86, 90, 34 };
		// int b[] = { 21, 35, 76, 18, 74 };

		System.out.println("Enter elements of first array :");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			{
				System.out.print(a[i]+" ");
			}
changes here 
			System.out.println("Enter elements of second array :");
			a[i] = sc.nextInt();
			for (i = 0; i < a.length; i++) {

				{
					System.out.println(b[i]+" ");
				}

			}

			for (i = 0; i < a.length; i++) {

				c[i] = a[i] - b[i];
			}
			System.out.println("New array c[] :");
			for (i = 0; i < a.length; i++) {
				System.out.print(c[i] + " ");

			}
		}
	}
}
