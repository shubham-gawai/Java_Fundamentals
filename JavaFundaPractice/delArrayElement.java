package JavaFundaPractice;

import java.util.Scanner;

public class delArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int k = sc.nextInt();
		int[] arr = new int[k];
		int[] cdel = new int[k-1];  
		 
		 
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i]+" ");
			
		}
		for (int i = 0; i < k; i++) {
		 
			
		}
		
		
	}

}
