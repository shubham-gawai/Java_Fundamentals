package method;
import java.util.Scanner;
public class addTwoNum {

		public static int add(int a, int b) {
			int sum = a+b;
			return sum;
			
		}
		public static void main(String sum) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first number :");
			int num1 = sc.nextInt();
			System.out.println("Enter second number :");
			int num2 = sc.nextInt();
			
			int result = add(num1,num2);
			System.out.println(result);
		}
}
