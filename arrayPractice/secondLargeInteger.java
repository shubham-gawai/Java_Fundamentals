package arrayPractice;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class secondLargeInteger{  
    
         static int secondHighest(int[] a, int total){ 
            int temp;
             
            for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++) {  
                    if (a[i] > a[j])   
                    {  
                         temp = a[i];  
                         a[i] = a[j];  
                         a[j] = temp;  
                    }  
                }  
            }
             
         return a[total-2];  
 } fgh
    
public static void main(String args[]) { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an array :");
            int n=sc.nextInt();
            int a[]= new int[n];
            
            System.out.println();
            
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
 
  
            System.out.println(secondHighest(a,n));  
  
    }
}