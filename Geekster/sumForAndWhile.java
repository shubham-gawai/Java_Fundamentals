
package Geekster;
import java.util.Scanner;
public class sumForAndWhile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 
		int sum=num+num;
		while(num<sum)
		{	 
			
			System.out.println(sum);
			sum +=num;
		}
		
	}
}
