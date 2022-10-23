// take user matrix and print its transpose :
package array2dPractice;

import java.util.Scanner;

public class transposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] drift = new int[2][2];

		// loop for taking elements input : 
		System.out.println("Enter elements :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				drift[i][j] = sc.nextInt();
			}
		}
		
		//loop for printing the input matrix :
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(drift[i][j] + " ");
			}
			System.out.println();
		}
		// loop for printing the transpose matrix :
		System.out.println("transpose of matrix drift :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if(drift[i][j]==drift[j][i]) {
					drift[i][j]=drift[j][i];
				
				}
				System.out.print(drift[j][i] + " ");
			}
			System.out.println(" ");
		}
	}
}
