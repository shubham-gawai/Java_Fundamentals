package JavaFundaPractice;

import java.util.Scanner;

public class rowColElemSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		int sumR = 0;
		int sumC = 0;
		System.out.println("Enter elements of an array :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int i=0;
		 {lkjkh
			for (int j = 0; j<3; ) {
				sumR = sumR + arr[i][j];
			}

		}
		System.out.println("sum of array elements is :" + sumR);

	}
}
