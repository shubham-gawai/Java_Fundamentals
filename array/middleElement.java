//make an array with user inputs of size 10. , then find middle element in an array
package array;

import java.util.Scanner;

public class middleElement {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		char[] mid = new char[10];

		System.out.println("Enter elements ::");
		for (char i = 0; i < 10; i++) {

			mid[i] = sc.next().charAt(0);

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(mid[i] + " ");
		}
		int m = mid.length / 2;
		System.out.println();
		System.out.println("Middle Element is :" + mid[m]);
	}
}
