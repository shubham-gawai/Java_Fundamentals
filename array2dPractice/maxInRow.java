package array2dPractice;

import java.util.Scanner;

public class maxInRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] perk = new int[3][3];
		
		int max = 0;
		System.out.println("Enter elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				perk[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(perk[i][j] + " ");
			}
			System.out.println();
		}

		// loop for checking the maximum element :

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (perk[i][j] == max) {
					max = perk[i][j];
				}
				
			}
		 m
		}
	}

}
