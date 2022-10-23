	// print the greater number among three taking user input by using Ternary operator : 

package Geekster;
import java.util.Scanner;
public class ternaryAppr {
	
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("enter firsr number");
			int a = sc.nextInt();
			
			
			System.out.println("enter second number");
			int b = sc.nextInt();
			
			
			System.out.println("enter third number");
			int c = sc.nextInt();
			
			
			int res = (a>b) ? (a>c ? a:c) :(b>c ? b:c);
			 
			 {
				 System.out.println("gretaer among three numbers ::"+ res);
			 }
		}
	
}