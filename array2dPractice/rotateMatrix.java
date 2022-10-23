// rotate a matrix 90 degrees clockwise :
package array2dPractice;
import java.util.Scanner;
public class rotateMatrix {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter length of matrix a*b :");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 
		 int [][] mat = new int[a][b];
		 int [][] matR =new int[a][b];
		 
		 System.out.println("Enter matrix elements :");
		 for(int i=0; i<a; i++) {
			 for(int j=0; j<b; j++) {
				 mat[i][j]= sc.nextInt();
			 
			 }
			  
		 }
		 System.out.println("input matrix :");
		 for(int i=0; i<a; i++) {
			 for(int j=0; j<b; j++) {
				  
				 System.out.print(mat[i][j]+" ");
			 }
			  System.out.println();
		 }
		 //loop for transposing the matrix first :
		 System.out.println("transposed matrix :");
		 for(int i=0; i<a; i++) {
			 for(int j=0; j<b; j++) {
				  if(mat[i][j]==mat[j][i]) {
					  mat[i][j]=mat[j][i];
				  }
				 System.out.print(mat[j][i]+" ");
			 }
			  System.out.println();
		 }
		 
		 // loop for swapping the columns :
		 // swap of transpose or 90 degree rotated matrix of input matrix :
		 System.out.println("rotated matrix 90d :");
		 for(int i=0; i<a; i++) {
			 for(int j=0; j<b; j++) {
				   if(mat[i][j]==matR[j][i]) {
					   mat[i][j]=matR[j][i];
					   System.out.print(matR[j][i]+" ");
				   }
				
			 }
			  System.out.println();
		 }
		 
		 for(int i=0; i<n; i++)  //n is the number of rows  
		 {  
		 for(int j=i; j<c/2; j++)   //c is the number of columns  
		 {  
		 if(i!=j)  
		 {  
		 //swapping elements of the first column with last column  
		 int temp = matrix[i][j];  
		 matrix[i][j]=marix[i][c-j-1];  
		 matrix[i][c-j-1]=temp;  
		 }  
		 }  
		 }
		  
		 
	}

}
