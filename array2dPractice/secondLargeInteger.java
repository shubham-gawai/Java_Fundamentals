package array2dPractice;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class secondLargeInteger { 
    public static int getSecondLargest(int[] a, int total){  
        int temp;
        
        for (int i = 0; i < total; i++) {  
            for (int j = i + 1; j < total; j++){ 
                
                if (a[i] > a[j]){  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-2];  
} 
    
public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in);
    int size=sc.nextInt();
    int a[]= new int[size];
    
    for(int i=0;i<a.length;i++){
    	
        a[i]=sc.nextInt();
        
    	}
    }
}