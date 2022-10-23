// take user matrix and print its transpose :
package array2dPractice;

import java.util.Scanner;

public class transposeTestProb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size :");
		int n = sc.nextInt();
		int[][] drift = new int[n][n];

		// loop for taking elements input : 
		System.out.println("Enter elements :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				drift[i][j] = sc.nextInt();
			}
		}
		
		
		// loop for printing the transpose matrix :
		System.out.println("transpose of matrix drift :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(drift[i][j]==drift[j][i]) {
					drift[i][j]=drift[j][i];
				
				}
				System.out.print(drift[j][i] + " ");
			}
			System.out.println(" ");
		}
	}
}
