	// write a program to print square of a number if it is less than 10 :
package practiceSesion;

import java.util.Scanner;
public class squareNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ::");
		int num = sc.nextInt();
		
		  int square = num * num;
		  if(num<10)
		  {
		  System.out.println(square);
		  }
		  
		}
		
	 }

