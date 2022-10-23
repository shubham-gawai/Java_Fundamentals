package stringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[6];
		System.out.println("Enter Array Elements :");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("revesre array is :");

		System.out.print(Arrays.toString(reverseArray(num)));

	}

	public static int[] reverseArray(int[] str) {
		int[] rev = new int[str.length];
		int i = 0;

		for (int j = str.length; j > 0; j--, i++) {

			rev[i] = str[j - 1];
		}
		return rev;

	}

}
