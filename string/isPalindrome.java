package string;

import java.util.Scanner;

public class isPalindrome
{
   public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
         
       
       String str = sc.nextLine();
       int n = str.length();
        
       boolean isPalindrome = true;  
        
       for(int i = 0; i < n; i++)
       {
         if(str.charAt(i) != str.charAt(n-1-i)) {
           System.out.println("Not Palindrome");
           isPalindrome = false;
           break;
         }
       }
         
       if(isPalindrome) {
         System.out.println("Palindrome");
       }
   }
}

