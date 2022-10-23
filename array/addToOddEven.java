package array;

import java.util.Scanner;

public class addToOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements :");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + 1 +" ");
			} else if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + 2 +" ");
			}

		}
	}

}
