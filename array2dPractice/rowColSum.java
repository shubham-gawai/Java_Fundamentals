package array2dPractice;

import java.util.Scanner;

public class rowColSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] york = new int[3][3];

		System.out.println("Enter elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				york[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(york[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int sumR = 0;
				// int sumC=0;
				sumR = sumR + york[i][j];
				// sumC=sumC+york[i][j];

				
//				System.out.println();
//				System.out.print(sumC);
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sumR);
				 
			}
			
		}
	}

}
