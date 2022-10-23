package practiceQues;
import java.util.Scanner;

public class pantStarPattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		 for(int i = 0; i<n; i++)
	        {
	            for(int j = n ; j>i; j--) {
	           
	                System.out.print("* ");
	            }
	            for(int k = 1; k<=4*i;k++) {
	            
	                System.out.print(" ");
	            }
	            for(int j = i+1 ; j<=n; j++) {
	        
	                System.out.print("* ");
	            }
	           
	            System.out.println();
	        }
}
}