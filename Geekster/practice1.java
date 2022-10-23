package Geekster;

import java.util.Scanner;

public class practice1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range ::");
		 
		int p = sc.nextInt();
		int i = 1;
		int count = 0;
		for (i = 1; i < p; i++)

		{
			{
				if ((i % 5 == 0) && (count < 20)) {

					count++;

					System.out.println(i);
				}	 
				 


			}
		}


			}
		
	
}
