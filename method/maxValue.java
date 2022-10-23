/* write 3 different methods that each takes different numbers of 
 * int arguments and returns its max value :
 */
package method;

import java.util.Scanner;

public class maxValue {
	public static int max(int a) {
		int max = a;
		return max;
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();

		System.out.println("Enter num3 :");
		int num3 = sc.nextInt();

		int result1 = max(num1);
		System.out.println("first max :");
		System.out.println(result1);

		int result2 = max(num1, num2);
		System.out.println("max among two :");
		System.out.println(result2);

		int result3 = max(num1, num2, num3);
		System.out.println("max among three :");
		System.out.println(result3);

	}

}