package JavaFundaPractice;
import java.util.Scanner;
 
public class rotateNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number :");
		 int n = sc.nextInt();
		 
		 int k = 3;
			/*
			 * logic : put the number of zeroes(k) after 1 
			 * for getting the factor of mul and div
			 */
		 //int  rem= n%1000;
		 int a = (int) (n%(Math.pow(10, k)));
		 //int  quo= n/1000;
		 int b =(int) (n/(Math.pow(10, k)));
		 
		 System.out.print(a);
		 System.out.print(b);
	}
}
