// write a program to print prime numbers from array :
package array;

import java.util.Scanner;

public class primePrint {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements :");
		for (int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		for (int i = 1; i < n; i++) {
			if(arr[i]%2 ==0 && arr[i]/1==arr[i]) {
				System.out.println(arr[i]);
			}
			 
		}

	}
}
