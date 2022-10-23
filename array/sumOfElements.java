// make an array with user inputs of size 10 then 
// find sum of all elements in array
package array;

import java.util.Scanner;

public class sumOfElements {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] set = new int[10];
		int sum = set[0];
		System.out.println("Enter Elements ::");
		for (int i = 0; i < 10; i++) {

			set[i] = sc.nextInt();

		}
		 
		for (int i = 0; i < 10; i++) {

			//System.out.print(set[i] + " ");
			sum = sum + set[i];
		}
		System.out.println(" ");
		System.out.println("sum of elements : " + sum);
		// System.out.println();
	}

}
