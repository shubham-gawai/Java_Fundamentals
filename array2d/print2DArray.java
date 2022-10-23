package array2d;

import java.util.Scanner;

public class print2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] set = new int[3][3];
		int[][] set1 = new int[3][3];
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter value :");
				 set[i][j] = sc.nextInt();
				  
			}
			
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				System.out.print((set[i][j]) * (set[i][j]) + "\t");
				
			}System.out.println();
			
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter value :");
				 set1[i][j] = sc.nextInt();

			}
			
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {

				System.out.print((set1[i][j]) * (set1[i][j]) + "\t");
				
			}System.out.println();
			
		}

	}
}
