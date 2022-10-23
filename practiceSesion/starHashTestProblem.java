package practiceSesion;

import java.util.Scanner;

public class starHashTestProblem {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number::");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("*");

		}
		for (int j = 1; j <= n; j++) {
			System.out.print("#");
		}

		System.out.println();

		for (int i = 1; i <= n; i++) {

			System.out.print("#");

		}
		for (int j = 1; j <= n; j++) {
			System.out.print("*");
		}

	}
}
