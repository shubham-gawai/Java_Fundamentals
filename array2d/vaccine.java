package array2d;

import java.util.Scanner;

public class vaccine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m =  sc.nextInt();

		int[][] set = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				set[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(set[i][j] + " ");
			}
			System.out.println();
		}

	}
}