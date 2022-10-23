	
		// Write a Java program to take the number input from user in hours and convert it into a number of days and years


		//1 hour - 0.0416667 day 
		//1 hour = 0.000114155 year 

	 
package practiceSesion;

import java.util.Scanner;
public class hoursToDays {

	public static void main(String[] args)
	{
		
		 Scanner sc = new Scanner(System.in);
		 double hour = sc.nextDouble();
		  
		 double day = hour*0.0416667;
		 double year = hour*0.000114155;
		
		 {
			 
		 System.out.println(day);
		 System.out.println(year);
		 
		 }
	}

}
