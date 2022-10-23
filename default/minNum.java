		// print the minimum number among two : (taking user input : see below)
/*
  public class minNum {
  
	public static void main(String args[]) {
		int num1 = 100;
		int num2=20;
		int min;
		
		if(num1<num2) {
			
			min = num1;
			
		}
		else {
			min = num2;

		}
		System.out.println(min);
		
		
	}
}
*/
	// print the minimum number among two taking user input :
import java.util.Scanner;
public class minNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b) 
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(b);
		}
		
	}

}



