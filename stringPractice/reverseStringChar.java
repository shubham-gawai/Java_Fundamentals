package stringPractice;
import java.util.Scanner;
public class reverseStringChar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter string :");
		 String game = sc.nextLine();
		 
		 char [] arr =game.toCharArray();
		 
		 String rev = " ";
		 for(char i : arr) {
			 rev = i + rev ;
			
		 }
		 System.out.println("Result array :");
		 System.out.println(rev);
		 

	}

}
