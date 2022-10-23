 import java.util.Scanner;
 public class numTable 
 {
	 public static void main(String args[]) 
	 {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		  
		 	System.out.println("table of num :" + a);
		 for(int i=1; i<=10; i++)
		 {
			 System.out.println(a+" * " + i + " = "+ a*i);
			  
		 }
		 
	 }
	 
 }
 
