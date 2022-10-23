	//switch case with default statement :
package Geekster;
public class switchCase {
		public static void main(String args[]) {
			
		int a = 3;
		switch (a) {
		   case 1:
			   System.out.println("Monday");
		   break;
		   case 2:
			   System.out.println("Tuesday");
		   break;
		   case 3:
			   System.out.println("Wednesday");
		   default:
			   System.out.println("Weekday");
		}
			
		}
}		  // didn't used a break statement in case 3: so that statement also getting printed 
