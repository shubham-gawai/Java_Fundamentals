// add two 2D matrices to get the result matrix :
package array2d;

import java.util.Scanner;

public class towMatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] pet = new int[3][3];
		int[][] pet1 = new int[3][3];
		int[][] pet2 = new int[3][3]; // stores the sum elements of two matrices

		System.out.println("Enter first matrix elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				pet[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pet[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Enter second matrix elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				

				pet1[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(pet1[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				pet2[i][j] = pet[i][j] + pet1[i][j];

			}
		}
		System.out.println();
		
		System.out.println("sum of first and second matrix :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pet2[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
