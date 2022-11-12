package array2d;

import java.util.Scanner;

public class matrixSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] set = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("Enter elements :");
				set[i][j] = sc.nextInt();
				 
			}
			 
		}
		System.out.println( );
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				 
				System.out.print(set[i][j]*set[i][j] + "\t ");
			}
			System.out.println();
		}
	}

}
