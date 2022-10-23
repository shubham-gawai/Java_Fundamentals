package JavaFundaPractice;
import java.util.Scanner;

class Arithmetic{
	int a,b;
	
	int add(int a, int b) {
		int sum =a+b;
		return sum;
	}
	int subtract(int a, int b) {
		int sub = a-b;
		return sub;
	}
}

class adder extends Arithmetic{

	@Override
	int add(int a, int b) {
		return super.add(a, b);
	}

	@Override
	int subtract(int a, int b) {
		return super.subtract(a, b);
	}
	  
}
class subtracter extends Arithmetic{

	@Override
	int add(int a, int b) {
		return super.add(a, b);
	}

	@Override
	int subtract(int a, int b) {
		return super.subtract(a, b);
	}
 
}


public class ArithmeticAdder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firsrt number x :");
		int x = sc.nextInt();
		System.out.println("Enter second number y :");
		int y = sc.nextInt();
		 
		 Arithmetic a = new adder();
		 System.out.println(a.add(x, y));
		 System.out.println(a.subtract(x, y));
	}

}
