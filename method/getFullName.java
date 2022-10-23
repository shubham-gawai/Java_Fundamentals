package method;

import java.util.Scanner;

public class getFullName {
	public static String getFullName(String name, String lastName) {
		String FullName = name + " " + lastName;
		return FullName;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name ::");
		String name1 = sc.nextLine();

		System.out.println("Enter your LastName ::");
		String name2 = sc.next();

		String result = getFullName(name1, name2);
		System.out.println("Your fullName :");
		System.out.println(result);

	}
}
