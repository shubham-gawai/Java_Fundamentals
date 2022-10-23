package Geekster;
			//ternary ope
import java.util.Scanner;
public class positiveOrNeg {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter a number :: ");
		 
		 int a = sc. nextInt();
		 
		 boolean isPositive= false;
		 isPositive= (a>=0) ? true : false;
		 
		 if(isPositive) {
			 System.out.println("Positive");
		 }
		 else {
			 System.out.println("Negative");
		 }
		 
	}

}
