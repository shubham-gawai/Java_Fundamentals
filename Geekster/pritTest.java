package Geekster;

import java.util.*;
import java.util.Scanner;

class Solution {

	public static void arrayPrint(int[] arr, int[] org, int N) {
		int sum = 0;
		arr = new int[N];
		org = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < N; i++) {
			sum = sum + arr[i];

		}
		int S = sum;
		S = S / 3;

		System.out.println(S);

		for (int i = 0; i < N; i++) {

			org[i] = arr[i] - 8;

		}
		for (int i = 0; i < N; i++) {
			System.out.print(org[i] + " ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		

	}
}
