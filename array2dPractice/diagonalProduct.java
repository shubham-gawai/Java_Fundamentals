// find the diagonal elements and print the product of it :
package array2dPractice;

import java.util.Scanner;

public class diagonalProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] set = new int[3][3];
		
		//step-1 : initialized the product as =1 :
		int product = 1;	

		//step-2 : taking user input of matrix elements :
		System.out.println("Enter elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				set[i][j] = sc.nextInt();

			}

		}
		//step-3 : printing the matrix of set [][] :
		System.out.println("matrix set[][]:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(set[i][j] + " ");
			}
			System.out.println();
		}
		//step-4 : printing the diagonal elements of the matrix set[][]:
		System.out.println("Diagonal elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					int diagonal = set[i][j];
					System.out.print(diagonal + " ");

				}

			}

		}
		System.out.println();
		
		//step -5 :initializing the product :
		System.out.println("product of diagonal :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				product = set[0][0] * set[1][1] * set[2][2];

			}

		}
		//step-6 : printing the product of the diagonal elements :
		System.out.println(product);

	}

}
