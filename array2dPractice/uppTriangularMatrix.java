// WAP to print the upper triangular matrix :
package array2dPractice;

import java.util.Scanner;

public class uppTriangularMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] dam = new int[3][3];

		//loop for taking input elements :
		System.out.println("Enter elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				dam[i][j] = sc.nextInt();
			}
		}
		
		// loop for printing the upper triangular matrix :
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i<=j) {
				System.out.print(dam[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		 
	}

}
