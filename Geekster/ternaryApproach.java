	// write a program to print greater among two taking user input by using ternary operator :

package Geekster;
import java.util.Scanner;
public class ternaryApproach {
	
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter firsr number");
			int a = sc.nextInt();
			
			System.out.println("enter second number");
			int b = sc.nextInt();
			
			
		int	res = (a>b) ? a:b ;
					
					System.out.println("greatest of two numbers :: " + res);
			
			
		}

}
