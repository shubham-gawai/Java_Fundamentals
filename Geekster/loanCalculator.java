package Geekster;
import java.util.Scanner;
public class loanCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int months = 3;
		
		for(int i=0; i<3; i++)
			amount = amount*90/100;
				System.out.println(amount);
		
		
	}
	//how much u will owe after 3 months, u are paying him back 10% of the remaining amount each month :
	//create a program which takes loan amount as input and outputs the remaining amount after three months :
	
}