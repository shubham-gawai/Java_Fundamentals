// write a program to sum all the elements in array :
package arrayPractice;

import java.util.Scanner;

public class arrayElementsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set[] = new int[5];

		int sum = 0;
		System.out.println("Enter elements :");

		for (int i = 0; i < 5; i++) {
			set[i] = sc.nextInt();

		}
		for (int i = 0; i < 5; i++) {
			System.out.print(set[i] + " ");
		}
		for (int i = 0; i < 5; i++) {
			sum = sum + set[i];

		}
		System.out.println();
			System.out.println("Sum of all elements : "+ sum);

	}

}
