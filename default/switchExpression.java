
//the switch expression (-> : shorthand operator)
import java.util.Scanner;

public class switchExpression {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day   :: ");
		char day = sc.next().charAt(0);

		String dayType = switch (day) {
		case  'm', 't', 'w', 'h', 'f' -> ("Working day");
		case 's', 'n' -> ("Weekend");
		default -> ("Invalid day");
		};
		System.out.println(dayType);
                     
	}

}
/*the switch expression 
  the switch expression makes the switch case block much shorter and doesn't
  use a break statement :
  notice that shorthand after the cases :
*/