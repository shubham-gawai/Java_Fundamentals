//Write a Java program to compute body mass index (BMI)

package practiceSesion;

import java.util.Scanner;

public class bodyMassIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float weight = sc.nextFloat(); // kg  
		float height = sc.nextFloat(); // height in square meter

		// kg/m^2 is the formula to calculate the BMI
		
		// input height is in meters and should be converted into square meters to put into the formula :
		// h is the variable taken to store the square meters value
		
		float h = height*height;  	// how to take a square of var ?????????
		float BMI = weight /h; 			
												 

		{
			System.out.println(BMI);
		}

	}

}
