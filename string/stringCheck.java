package string;

import java.util.Scanner;

public class stringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = new String();
		String str2 = new String();
		int count =0; 
		boolean  isFound = false;
		for(int i=0; i<str1.length(); i++) {
			int k=i;
			count =0;
			for(int j=0; j<str2.length(); j++) 
				
				if(str1.charAt(k) != str2.charAt(j)) {
					break;
				}
				count++;
			vh	k++;
			
			}
			if(count==str2.length()) {
				isFound = true;
				System.out.println("Found ");
				 
			} 
		}
		
		 

	
}
