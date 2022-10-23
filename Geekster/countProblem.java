package Geekster; 
import java.util.Scanner;

public class countProblem {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the range ::");
		int p = scan.nextInt();
		
		int count=0;
		for (int i = 5; i < p; i++)

		{
			if(i % 5 == 0  ) {
			 	
				
				while(count <= 20) 
				{ 						// count and the whole while loop is not working there
					count++ ; 
				}
				
				{
					System.out.println(i);
				}
				 if(i==100)
				 {
				    break;
				 }
			
			}
		}
	}
}