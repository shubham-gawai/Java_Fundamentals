		// write a program to print a sum of cube of given numbers :

package practiceSesion;

import java.util.Scanner;
public class sumOfCube{
	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int n = sc. nextInt();
	        
	        int cube = (n*(n+1)/2);
	        int sum = cube * cube ;

	        System.out.println(sum);

	}
}
		/////////////////find using for loop also:


/*
public class sumOfCube {

	public static void main(String[] args) {
		 int [] a = {1,2,3,4,5,6,7,8};
		 
		  
		 int sum = a[0]*a[0]*a[0] + a[1]*a[1]*a[1] + a[2]*a[2]*a[2] + a[3]*a[3]*a[3] + a[4]*a[4]*a[4] + a[5]*a[5]*a[5] + a[6]*a[6]*a[6] + a[7]*a[7]*a[7];
		 
		 System.out.println(sum);
		 
	}
}
*/
