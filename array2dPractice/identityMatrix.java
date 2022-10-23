// check if the matrix is identity matrix or not :
// identity matrix is diagonal elements are 1 and other else are 0 : 
package array2dPractice;

import java.util.Scanner;

public class identityMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of row and col :");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] set = new int[row][col];

		// take a boolean :
		// enter all the elements of the matrix :
		boolean identity = true;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)

			{
				System.out.println("Enter elements :");
				set[i][j] = sc.nextInt();
			}

		}

		// print the matrix set[][] :
		System.out.println("matrix set[][] :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(set[i][j] + " ");

			}
			System.out.println();

		}

		// compare if row is not equal to col :
		// and print invalid matrix (not a square matrix :)
		if (row != col) {
			System.out.println("Invlaid");
		}

		// put the i, j and set[i][j] relation :
		// in nested if statements :
		// check the boolean :
		else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i == j && set[i][j] != 1) {
						identity = false;
						break;
					}
					if (i != j && set[i][j] != 0) {
						identity = false;
						break;
					}
				}

			}
		}

		// finally taking boolean check if identity or not :
		if (identity)
			System.out.println("identity");
		else
			System.out.println("not identity");

	}

}
