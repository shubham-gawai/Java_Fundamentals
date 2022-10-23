		// write a program to check if a number is prime or not :

import java.util.Scanner;
public class primeRnot {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int num, i = 2;
		
			System.out.println("Entre a number : ");
			
			num=sc.nextInt();
			
			boolean a = false;
			while (i <= num / 2) 
			{
				if (num % i == 0) {
					a = true;
					break;
			}
				++i;
			}
					if (!a)
						System.out.println(num + " is a prime number.");
					else
						System.out.println(num + " is not a prime number.");
    		 
	}

	
}
    
    /*   
import java.util.Scanner;
public class primeRnot 
 {
	 public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter a number : ");
	    
	    int n=sc.nextInt();
	    int cnt = 0;
	    
	    if(n==1)
	    	
	    	System.out.println("number is not prime ");
	    
	         else if(n==2)

	            System.out.println("number is prime ");
	     else
	    {
	      for(int i = 2; i <= n; i++) 
	      {
	            if (n % i == 0)
	                cnt++;
	            break;
	      }

	        if (cnt == 1)
	            System.out.println("number is not Prime ");
	        else
	            System.out.println("number is Prime");
	    }
	}
	
 }

    		*/