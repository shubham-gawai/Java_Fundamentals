// convert a string into array by using char array :
package stringPractice;

public class stringToArray {

	public static void main(String[] args) {
		String s = "Hello World";
	    
		
		char[] str = s.toCharArray();
		int n = str.length;
		for(int i=0; i<n; i++) {
			System.out.print(str[i]+" ");
		}
		//System.out.print(s.trim());
	}

}
