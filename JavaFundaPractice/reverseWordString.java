// replace Welcome by its reverse in a string :
package JavaFundaPractice;

public class reverseWordString {

	public static void main(String[] args) {
		String s ="Welcome to programming cocepts";
		
		String str = s.substring(0,7);
		System.out.println(str);
		
		char [] arr = str.toCharArray();
		 
		 String rev = " ";
		 for(char i : arr) {
			 rev = i + rev ;
			
		 }
		 System.out.println(rev);
		 System.out.println(s.replace("Welcome",rev));
	}

}
