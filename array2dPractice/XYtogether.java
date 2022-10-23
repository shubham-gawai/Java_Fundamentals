package array2dPractice;
import java.util.Scanner;
public class XYtogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("x and y size :");
		 int n = sc.nextInt();
		 
		 int [] arr = new int[n * 2];
		 
		 System.out.println("enter array elements :");
		 for(int i=0; i<arr.length; i++) { 
			 arr[i] = sc.nextInt();
			  
		 }
		  
		 System.out.println();
		 for(int i=0; i<arr.length/2; i++) {
			 System.out.print(arr[i]+" ");
			 for(int j=arr.length/2+1; j<arr.length; j++) {
				 
				 System.out.print(arr[j]+" ");
				 
				 
			 }
			  
			  
		 }
	}

}
