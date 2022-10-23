	// find the max number among two  && taking user input : (see below)
/*
  public class maxNUm {
 
	public static void main(String args[]) {
		int num1 =10;
		int num2 = 20;
		int max;
		
		if(num1 > num2) {
			
			max = num1;
		}
		else {
			max = num2;
		}
		System.out.println(max);
		
	}
}
*/
	// print the maximum number among two taking user input :
import java.util.Scanner;
public class maxNUm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) 
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(b);
		}
		
	}

}
