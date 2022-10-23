//write a method to print sum of elements in array : 
package arrayPractice;

import java.util.Scanner;

public class arraySumMethod {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int pub[] = new int[6];
		int n = pub.length;

		int sum = 0;

		System.out.println("Enter elements :");

		for (int i = 0; i < n; i++) {
			pub[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(pub[i] + " ");

		}
		for (int i = 0; i < n; i++) {
			sum = sum + pub[i];
		}
		System.out.println();
		System.out.println("Sum of elements : " + sum);
	}
}
