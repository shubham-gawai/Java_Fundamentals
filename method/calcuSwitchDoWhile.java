package method;

import java.util.Scanner;

public class calcuSwitchDoWhile {

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtract(int a, int b) {
		int diff = a - b;
		return diff;
	}

	public static int multiply(int a, int b) {
		int prod = a * b;
		return prod;
	}

	public static float divide(int a, int b) {
		float quo = a / b;
		return quo;
	}

	public static float remainder(int a, int b) {
		float mod = a % b;
		return mod;
	}

	public static float average(int a, int b) {
		float avg = a + b / 2;
		return avg;
	}

	public static void main(String args[]) {

		char ch = 'N';
		do {
			Scanner sc = new Scanner(System.in);

			// System.out.println("Enter choice ::");
			System.out.println(
					"choice : addition :1, subtraction :2, multiplication :3, division :4, modulo :5, average :6");
			int choice = sc.nextInt();

			if (choice >= 1 && choice <= 6) {
				System.out.println("Enter fisrt number ::");
				int num1 = sc.nextInt();
				System.out.println("Enter second number ::");
				int num2 = sc.nextInt();

				switch (choice) {
				case 1:
					int result1 = add(num1, num2);
					System.out.println(result1);
					break;
				case 2:
					int result2 = subtract(num1, num2);
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
					float result5 = remainder(num1, num2);
					System.out.println(result5);
					break;
				case 6:
					float result6 = average(num1, num2);
					System.out.println(result6);
					break;
				}

			} else {
				System.out.println("Invalid choice");
			}

			System.out.println("Do you want to continue 'Y/N' ? :");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		if(ch!='Y'|| ch!='y') {
			System.out.println("Dont go further");
		}
	}

}
