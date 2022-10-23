package Geekster;
import java.util.Scanner;
public class decToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enetr any number :");
		int N = sc.nextInt();	// input number 
		
		int b = N/2;	//7
		 
		int q = b%2;	//1
		
		int x = b * q;
		
		System.out.println(x);
		 
		  
		for(int i=0; i<=N; i++) {
			 System.out.println(q);
			 
			 
		}
		 
		
	}

}
