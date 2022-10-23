package array;

import java.util.*;
import java.util.Scanner;

public class maxMinSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int minSum = 0, maxSum = 0;

		System.out.println("Enter elements :");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		// loop for min sum :
		for (int i = 0; i < 4; i++) {
			minSum = minSum + arr[i];
		}
		// System.out.println(minSum);

		// loop for max sum :
		for (int i = 1; i < 5; i++) {
			maxSum = maxSum + arr[i];
		}
		System.out.println("minSum :" + minSum + ","  + "maxSum :" + maxSum);
	}

}
