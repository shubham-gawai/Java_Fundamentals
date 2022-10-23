 
	import java.util.Scanner;
	public class enhancedloop
	{
	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

	        String text = sc.nextLine();

	        char[] arr = text.toCharArray();

	        String rev = " ";

	// enhaced for loop or for each loop 

	        for(char i : arr){
	            rev = i+rev;
	        }

	        
	        System.out.println(rev);


		}
	
}
