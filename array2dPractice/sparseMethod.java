package array2dPractice;

import java.util.Scanner;

public class sparseMethod {

	public static void sparseMtsrixCheck(int[][] dam, int a, int b) {

		int count = 0;

		// loop for checking the count of 0 :
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (dam[i][j] == 0) {
					count++;
				}
			}
		}

		// loop for checking the matrix is sparse or not :
		System.out.println("count :" + count);

		if (count > a * b / 2) {
			System.out.println("matrix is Sparse ");
		} else

		{
			System.out.println("Matrix is not sparse ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of matrix :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] dam = new int[a][b];

		// loop for taking input elements :
		System.out.println("Enter elements :");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				dam[i][j] = sc.nextInt();

			}

		}

		// loop for printing the input matrix :
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(dam[i][j] + " ");
			}

			System.out.println();
		}

		sparseMtsrixCheck(dam, a, b);

	}

}
