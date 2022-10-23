package JavaFundaPractice;

import java.util.Scanner;

public class sumOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[3][3];
		int[][] B = new int[3][3];

		int[][] C = new int[3][3]; // sum matrix

		int sumOdd = 0;
		int sumEven =0;
		System.out.println("Enter elements of an array :");
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
	 

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				 if(A[i][j] % 2 !=0) {
					 sumOdd=sumOdd+A[i][j];
				 }
				jkfSystem.out.println(sumOdd+" ");
			}
			System.out.println();
		}
		 

	}
}
