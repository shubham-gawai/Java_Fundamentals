	//  Write a Java program to take the number input from user in inches and convert it to meters. 
	//	1 inch = 0.0508 meters  :: right conversion(1 inch=0.254 meters) :

package practiceSesion;

import java.util.Scanner;
public class inchesMetreConv {

	public static void main(String[] args) 
	{
		
		 Scanner sc = new Scanner(System.in);
		 double inch = sc.nextDouble();
		 
		
		 double meters = inch*0.0254;
		 
		 System.out.println(meters);
		 
	}

}
