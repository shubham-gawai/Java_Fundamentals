// print the count of given elements in an array for given input :

package array2d;

import java.util.Scanner;

public class presentCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array :");
		int n = sc.nextInt();

		int[][] set = new int[n][n];
		int count =0;
		
		System.out.println("Enter array elements :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				set[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(set[i][j] + " ");
			}
			System.out.println();
		}
		// k is the element to be search for in the array :
		System.out.println("Enter the element you are searching for :");
			int k= sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				 if(set[i][j] == k) {
					 count++;
				 }
			}
			
		}
		System.out.println("the element " + k +" present "+ count +" times in array");

	}
}
