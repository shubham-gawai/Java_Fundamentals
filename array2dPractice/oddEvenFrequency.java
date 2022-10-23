package array2dPractice;

import java.util.Scanner;

public class oddEvenFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of matrix :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] creed = new int[a][b];

		int countOdd = 0;
		int countEven = 0;
		// loop for taking input elements :
		System.out.println("Enter elements :");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				creed[i][j] = sc.nextInt();
			}
		}
		// loop for printing the input matrix :
		System.out.println("Input matrix :");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				System.out.print(creed[i][j] + " ");

			}
			System.out.println();
		}

		// loop for checking count of odd and even numbers :
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (creed[i][j] % 2 != 0) {
					countOdd++;

				}
				if (creed[i][j] % 2 == 0) {
					countEven++;
				}
			}

		}
		// printing the count of odd and even numbers :
		System.out.println("odd numbers count :" + countOdd);
		System.out.println("Even numbers count :" + countEven);

	}

}
