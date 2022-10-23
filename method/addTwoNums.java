// write a method that adds two numbers and return the answer :
package method;
import java.util.Scanner;
public class addTwoNums {
		
	public static int add(int a, int b) {
		int sum =a+b;
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fisrt number ::");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number ::");
		int num2 = sc.nextInt();
		
		int result = add(num1, num2);
		
		System.out.println("Sum of given numbers :");
		System.out.println(result);
		
	}
			
}
