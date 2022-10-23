package Geekster;

import java.util.Scanner;

public class termFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array :");
		int n = sc.nextInt(); // array length
		int[] arr = new int[n]; // input array

		System.out.println("enter array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			;
		}
		System.out.println();
		System.out.println("Enter term number :");
		int h = sc.nextInt();
		
		System.out.print(arr[h] + " ");
	}

}
