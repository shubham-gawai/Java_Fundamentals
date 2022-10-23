package array2d;

import java.util.Scanner;

public class MatrixArethmeticOp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] set = new int[3][3];
		 
		int i, j;
		//int sum = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Enter value :");
				set[i][j] = sc.nextInt();
				

			}

		}System.out.println("Matrix mul 1");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				
				System.out.print(Math.pow((set[i][j]),3) + "\t");

			}
			System.out.println();

		}
		System.out.println();
		
		System.out.println("Matrix mul 2");
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				
				System.out.print((set[i][j]) * (set[i][j]) + "\t");

			}
			System.out.println();

		}
		
		System.out.println("Addition");
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				
				System.out.print(((set[i][j]) * (set[i][j]))+((set[i][j]) * (set[i][j])) + "\t");

			}
			System.out.println();

		}
		System.out.println("Subtraction :");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				
				System.out.print(Math.pow((set[i][j]),3)-(set[i][j]) * (set[i][j]) + "\t");

			}
			System.out.println();

		}
		
	}
}
