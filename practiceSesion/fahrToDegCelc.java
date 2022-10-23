// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//if i put the value of  fahreheit it shows the temperature 0.0 degree celcius
package practiceSesion;

import java.util.Scanner;

public class fahrToDegCelc 
{
    public static void main(String[] args){
    	
    Scanner sc = new Scanner(System.in);
    float celsius = sc.nextFloat();
 

    float fahrenheit =((celsius*9)/5)+32;

        {
             System.out.println("Temperature in fahrenheit is: "+ fahrenheit);
        }
 
}
}
