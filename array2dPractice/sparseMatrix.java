package array2dPractice;

import java.util.Scanner;

public class sparseMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of matrix :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] dam = new int[a][b];

		int count = 0;
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
				;
			}
			System.out.println();
		}
		// loop for checking the sparse matrix :
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (dam[i][j] == 0) {
					count++;

				}

			}

		}
		System.out.println("count :" +count); 
		 
		if (count > a*b / 2) {
			System.out.println("matrix is Sparse ");
		} else {
			System.out.println("Matrix is not sparse ");
		}
	}

}
