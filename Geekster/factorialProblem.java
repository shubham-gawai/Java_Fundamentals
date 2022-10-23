// WAP to find the factorial of a given number :

package Geekster;

import java.util.Scanner;

public class factorialProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ::");
		int num = sc.nextInt();

		int fact = 1;

		for (int i = num; i >= 1; i--) {

			fact = fact * i;
		}
		System.out.println("Factorial of the given number is ::" + fact);
	}
}
