		// print numbers in order 1 100 2 99 3 98 4 97 5 96... (from 1 to 100 and 100 to 1)
		// for loop gives the right output for this program
package practiceSesion;

public class incrDecrOrder {

	
	public static void main(String[] args) 
	{
		 int i=1;
		 int j=100;
		 
		 for(i=1; i<=100; i++)
		 {
			 System.out.print(i + " ");
			 System.out.print(j + " ");
			 j--;
		 }

	}

}


/*
package practiceSesion;

public class incrDecrOrder {

	public static void main(String[] args) {
		int a =1;
		int b =100;
		
		while(a<b)
		{
			System.out.print(a + " ");
			a++;
			
			System.out.print(b + " ");
			b--;
		}
			// this program doesn't give the desired output 
			// it print only incr till 51 and decr till 50
		
	}
}
*/
