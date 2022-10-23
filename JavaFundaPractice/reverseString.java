// replace Welcome by its reverse in a string :

package JavaFundaPractice;

public class reverseString {

	public static void main(String[] args) {
		String s ="Welcome to programming cocepts";
		
		 // IP : I am at ease 
		 // OP : I ma ta esae 
		String str = s.substring(0,7);
		char [] arr = s.toCharArray();
		 
		 String rev = " ";
		 for(char i : arr) {
			 rev = i + rev ;
			jkgh
		 }
		 //System.out.println(rev);
		 System.out.println(s.replace("Welcome",rev));
	}

}
