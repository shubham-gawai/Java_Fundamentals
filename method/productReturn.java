/*write three different methods that each takes int, float and long 
 * numbers as input and returns its multiplication value.
 */
package method;

import java.util.Scanner;

public class productReturn {

	public static int multiply1(int a, int b) {
		int prod = a * b;
		return prod;
	}

	public static float multiply2(float a, float b) {
		float prod = a * b;
		return prod;
	}

	public static long multiply3(long a, long b) {
		long prod = a * b;
		return prod;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1 :");
		long num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		long num2 = sc.nextInt();

		int result1 = multiply1((int) num1, (int) num2);
		System.out.println(result1);

		float result2 = multiply2((float) num1, (float) num2);
		System.out.println(result2);

		long result3 = multiply3(num1, num2);
		System.out.println(result3);

	}

}
