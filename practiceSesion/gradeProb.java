/* write a program to print the different g marks statement
 * 400 to 500 -> A
 * 300 to 400 -> B
 * 200 to 300 -> C
 * 100 to 200 -> D
 */
package practiceSesion;

import java.util.Scanner;
public class gradeProb 
{
	 public static void main(String args[])
	 {
		 
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		 
		 if(m>=100 && m<200)
			 
		 {
			 System.out.println("D");
		 }
		 
		 else if(m>=200 && m<300)
		 {
			 System.out.println("C");
		 }
		 
		 else if(m>=300 && m<400)
		 {
			 System.out.println("B");
		 }
		 
		 else if(m>=400 && m<500)
		 {
			 System.out.println("A");
		 }
		
		 
	 }
	 

}

