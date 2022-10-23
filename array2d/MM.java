package array2d;

import java.util.Scanner;

public class MM {
	
	public static void matrixPrintMethod(int [][]set) {
		
		System.out.println( );
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				 
				System.out.print(set[i][j] + "\t ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] set = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Enter elements :");
				set[i][j] = sc.nextInt();
				 
			}
			 
		}
		matrixPrintMethod(set);
	}

}

