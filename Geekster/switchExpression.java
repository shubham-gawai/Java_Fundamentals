package Geekster;
public class switchExpression {
	 public static void main(String args[]) {
		 
		 int day = 2;
		 String dayType = switch(day) {
		 case 1,2,3,4,5 -> ("Working day");
		 case 6,7 -> ("Weekend");
		 default -> ("Invalid day");
		 } ;
		 System.out.println(dayType);
		 
	 }

}		//the switch expression :

		//the switch expression makes the switch case block much shorter and doesn't use a break statement :
		//notice that shorthand after the cases :