package Geekster;
import java.util.Scanner;
public class reverseString {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse:");
		int n=sc.nextInt();
		int c=0;
		
		while(n!=0)
		{
			int b=n%10; //remainder for (value 123)  b=3; c=3;
			c=c*10+b;
			n=n/10; //dividend n=12;
					
		}
		System.out.println(c);
		
		 
		
		
	}
			//WAP to take a String as an input and output is reverse
			//the given code takes string as an input and converts it into a char array, 
			//which contains letter pf the string as its elements:
}