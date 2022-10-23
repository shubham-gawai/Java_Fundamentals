package array2d;

import java.util.Scanner;

public class matrixMethods {

	public static void matrixSquare(int[][] set) {

		// square of input matrix :

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print((set[i][j]) * (set[i][j]) + "\t");

			}
			System.out.println();

		}

	}

	public static void matrixAddition(int[][] set) {

		// addition of the given input matrix with itself
		// (input matrix + input matrix) :

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print((set[i][j]) + (set[i][j]) + "\t");

			}
			System.out.println();

		}

	}

	public static void matrixSubtraction(int[][] set) {

		// subtraction of the input matrix Square and input matrix
		// (input matrix cube(power3) - input matrix)

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(Math.pow((set[i][j]), 3) - (set[i][j]) + "\t");

			}
			System.out.println();

		}

	}

	public static void matrixPower6(int[][] set) {

		// direct printing the 6th power of matrix elements :

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(Math.pow((set[i][j]), 6) + "\t");

			}
			System.out.println();

		}
	}

	public static void matrixDivision(int[][] set) {

		// input matrix square divide by input matrix :

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(((set[i][j]) * (set[i][j])) / (set[i][j]) + "\t");

			}
			System.out.println();
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[][] set = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter value :");
				set[i][j] = sc.nextInt();

			}

		}
		matrixSquare(set);
		System.out.println();
		matrixAddition(set);
		System.out.println();
		matrixSubtraction(set);
		System.out.println();
		matrixPower6(set);
		System.out.println();
		matrixDivision(set);
	}

}
