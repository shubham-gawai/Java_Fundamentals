package Geekster;

import java.util.Scanner;

public class tableOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number ::");
		int num = sc.nextInt();

		/*
		   for(int i=1; i<=10; i++) { int table = num * i;
		   
		   System.out.println(num +"*"+ i + "=" + table);
		   
		   }
		 */
		
		 
		int i = 1;
		while (i <= 10) {
			int table = num * i;

			System.out.println(num + "*" + i + "=" + table);
			i++;
		}
	}

}
