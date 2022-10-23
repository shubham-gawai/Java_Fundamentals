package array2dPractice;
import java.util.Scanner;
public class incrDecr2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter any number :");
			int x = sc.nextInt();
		
			String [] str = {"--x", "x++", "x++"};

			for(int i=0; i<str.length; i++) {
				
				if(str[i]=="--x") {
					--x;
				} else if(str[i]=="x++") {
					x++;
				}else {
					x++;
				}hjgh
			
		}
			for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
			}
		 
	}

}
