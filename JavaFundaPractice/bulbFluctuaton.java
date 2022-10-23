package JavaFundaPractice;

import java.util.Scanner;

public class bulbFluctuaton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Bulbs :");
		int bulb = sc.nextInt();

		System.out.println("Enetr term of Bulb :");
		int n = sc.nextInt();
		
		int fluct =(n * n)-3;
		 
		System.out.println(fluct);
		for (int i = 0; i <= bulb; i++) {
			 if(fluct==n*n) {
				// System.out.println(fluct);
			 }
				//fluct = bulb + 2;
				
		}

	}

}
