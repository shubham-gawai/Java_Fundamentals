	 /*  write a program to get the final amount, if the discount for purchase of
	  *  above 10000 is 10% and for below 10000 is 5% 
	  */
package Geekster;

import java.util.Scanner;
public class ternaryBillAmt {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter billing amount :: ");
		double i = sc.nextDouble();		//
		
		
		
		double discRes = i*0.9;
		
		discRes = (i>=10000) ? 0.9*i : 0.95*i;

		System.out.println("final billing amount after discount :: ");
		
		{
		System.out.println(discRes);
		}
	}
	

}