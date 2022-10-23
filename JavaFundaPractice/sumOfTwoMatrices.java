package JavaFundaPractice;

import java.util.Scanner;

public class sumOfTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[3][3];
		int[][] B = new int[3][3];

		int[][] C = new int[3][3]; // sum matrix

		int sum = 0;
		System.out.println("Enter elements of first array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter elements of second array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				B[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + A[i][j] + B[i][j];
				System.out.println(A[i][j] + B[i][j]+" ");
			}
			System.out.print();
		}
		 

	}
}
