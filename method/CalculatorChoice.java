package method;
/*
 * 
 */


import java.util.Scanner;

public class CalculatorChoice {
	
// function declaration :
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static int diff(int a, int b) {
		int diff = a - b;
		return diff;
	}

	public static int multiply(int a, int b) {
		int multiply = a * b;
		return multiply;
	}

	public static float divide(float a, float b) {
		float quo = a / b;
		return quo;
	}

	public static float modulo(float a, float b) {
		float mod = a % b;
		return mod;
	}

	public static float average(float a, float b) {
		float avg = (a + b)/2;
		return avg;
	}

// function calling :
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choice= addition :1, subtraction :2, multiplication :3, division :4, modulo :5, average :6");
		int choice = sc.nextInt();
		
	//	System.out.println("Enter choice");

		System.out.println("Enter fisrt number ::");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number ::");
		int num2 = sc.nextInt();
		

		if(choice >= 1 && choice <= 6) {
			switch (choice) {
			case 1:
				int result1 = add(num1, num2);
				System.out.println(result1);
				break;
			case 2:
				int result2 = diff(num1, num2);
				System.out.println(result2);
				break;
			case 3:
				int result3 = multiply(num1, num2);
				System.out.println(result3);
				break;
			case 4:
				float result4 = divide(num1, num2);
				System.out.println(result4);
				break;
			case 5:
				float result5 = modulo(num1, num2);
				System.out.println(result5);
				break;
			case 6:
				float result6 = average(num1, num2);
				System.out.println(result6);
				break;
			}
			
		}
		else{
			
			System.out.println("Not valid !");
		}

	}
}
