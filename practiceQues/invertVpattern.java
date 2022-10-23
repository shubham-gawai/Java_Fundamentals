package practiceQues;
import java.util.Scanner;
public class invertVpattern {
	 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int n = sc.nextInt();
			int s=0;
			
			 for(int i = n-1; i>= 0; i--)
		        {
		            for(int j = n-1;j>s;j--)
		                System.out.print(" ");
		            System.out.print("*");
		            for(int k=1;k<s;k++)
		                System.out.print(" ");
		            if(i<n-1)
		                System.out.print("*");
		            System.out.println();
		        }
	}
}
