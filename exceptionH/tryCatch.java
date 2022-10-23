package exceptionH;

public class tryCatch {

	public static void main(String args[]) {

		int num1 = 10, num2 = 0;
		int a[] = { 2, 0, 4, 6 };
		int r = 0;

		System.out.println("Hello");

		try {
			r = num1 / num2;
			System.out.println("Division=" + r);

		} catch (ArithmeticException e) {

			System.out.println("Number cannot divided by 0");

		}

	}
}
