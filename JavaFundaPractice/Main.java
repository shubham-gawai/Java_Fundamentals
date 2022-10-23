package JavaFundaPractice;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static int cubeSquare(int T, int[] N) {
		int count =0;
		for (int i = 0; i < T; i++) {
			if (N[i] / N[i] == 0 || (N[i]*N[i]*N[i])/(N[i]*N[i]*N[i])==0)
			{
				count++;
				 
			}
		}
hgh
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] N = new int[T];

		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();

			sc.close();

			System.out.println(cubeSquare(T, N));
		}

	}
}
