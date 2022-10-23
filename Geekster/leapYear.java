		// leap year program by simple if else and the ternary operatror :
package Geekster;

import java.util.Scanner;
public class leapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%400==0)
		{
			System.out.println("Leap Year");
		}
		else if (year%4==0 && year%100 !=0)
		{
			System.out.println("Leap Year");
		}
		else 
		{
			System.out.println("Not a Leap Year");
		}
		
	}
}
	
			// condition 1 : it should be divisible by 4 and 400 
			// condition 2 : it should not be divisible by 100 
			
	

	
	
/*
		public static void main(String arg[])	
		{
		    long a,y,c;
	             	Scanner sc=new Scanner(System.in);
		    System.out.print("enter  any  calendar year :");
	                   y=sc.nextLong();	     
		    if(y!=0)
		    {
			a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));       
			if(a==1) 
			    System.out.println(y+" is a leap year");       
	               	else
			    System.out.println(y+" is not a leap year");                       
		    }
		    else
			System.out.println("year zero does not exist ");                       
	 	}
	
}
*/