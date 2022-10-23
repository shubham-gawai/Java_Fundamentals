package Geekster;
import java.util.Scanner;

public class recognizeChar
{
    public static void main(String args[])
    {
             Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);        
        int a=n;
        
        if(a>=65 && a<=90)
        {
            System.out.print("1");
        }
        else if(a>=97 && a<=122)
        {
             System.out.print("0");
        }
        else
        {
             System.out.print("-1");
        }
      
        
         	// 		//recognize char if uppercase(1), lowercase(0), neither(-1) :

    }
    
    
    
    
}