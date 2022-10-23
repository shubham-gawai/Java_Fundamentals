import java.util.Scanner;

public class nthFibbonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		
		int a = 0, b = 1, c=0;
		System.out.println("Enter any number :");
		int n = sc.nextInt();
		int i;
		
		int sum=0;
		 
		for(i=2; i<=n; i++) {
			
			c=a+b;
			if(i==n) {
				System.out.println(c+" ");
				
			}
			
			
			a=b;
			b=c;
			 
		}
		System.out.print(c%10);
		System.out.print((c/10) % 10);
		 
		 
	}
}
