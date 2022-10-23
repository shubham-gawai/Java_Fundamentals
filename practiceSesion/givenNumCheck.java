package practiceSesion;

import java.util.Scanner;
public class givenNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ::");
		int num= sc.nextInt();
		
		switch(num) {
		
		case 10:
		case 20:
		case 30:
		case 40:
		case 50:
			System.out.println("Matches");
			break;
			default:
				System.out.println("Doesn't match");
		
		}
	}

}
