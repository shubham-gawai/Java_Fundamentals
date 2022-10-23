// write a program to print fibonacci numbers for user input : 
package Geekster;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number ::");

		int n = sc.nextInt();
		System.out.print("0 1 ");

		int count = 2;
		int a = 0, b = 1;
		while (count < n) {

			int sum = a + b;

			System.out.print(sum + " ");

			a = b;
			b = sum;
			count++;
		}
	}
	// check if the numbers 0 1 is needed ther
}
