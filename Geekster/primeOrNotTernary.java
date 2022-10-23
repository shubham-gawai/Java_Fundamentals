package Geekster;
import java.util.Scanner;
public class primeOrNotTernary {

	public static void main(String[] args) {
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
	}

}
