// write a method to reverse a number :
package methodPract;
import java.util.Scanner;
public class reverseNum {
	
	public static int reverseNumber(int n) {
		
		int rev =0;
		int rem;
		while(n>0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
			
		}
		return rev;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		
		int result = reverseNumber(num);
		
		System.out.println("reversed number ::" + result);
	}
}
