package JavaFundaPractice;
import java.util.Scanner;
public class stirngMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [][] names = new String[3][3];
		int count =0;
		System.out.println("Enter array Elements :");
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names.length; j++) {
				names[i][j]=sc.nextLine();
				 
			}
			
		}
		System.out.println("Entred matrix  :");
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names.length; j++) {
				System.out.print(names[i][j]+" "+" ");
			}
			System.out.println();
		}
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names.length; j++) {
				 
				if(names[i][j]=="A") {
					count++;
					
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}
