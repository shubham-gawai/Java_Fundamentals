// WAP to find first index at which element is present :
package arrayPractice;

import java.util.Scanner;

public class lastIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cap[] = new int[5];
		int n = cap.length;

		System.out.println("Enter Elements :");
		for (int i = 0; i < n; i++) {

			cap[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {

			System.out.print(cap[i] + " ");
		}

		System.out.println();
		System.out.println("last index element :" + cap[n-1]);
		//or simply we can print 
		// System.out.println("last index element :" + cap[4]);

	}
}
