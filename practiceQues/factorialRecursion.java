package practiceQues;
import java.util.Scanner;
public class factorialRecursion {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		int i, fact =1;
		int n = 4;
		fact = factoRecursion(n);
		System.out.println("factorial :"+ fact);

	}
	
	public static int factoRecursion(int n) {
		if(n==0) {
		 return 1;
	 }else {
		 return(n * factoRecursion(n-1));
	 }
		 
	 
	}
 
}
