	// calculate a&b , a|b, a^b manually :

package wikiAssignments;

public class feb21_Q2 {
	public static void main(String args[]) {
		
	int a =7 ;					// 0 1 1 1  		-> 7
	int b =5;					// 0 1 0 1			-> 5
						 	 //	-----------
	System.out.println(a&b);	// 0 1 0 1 			-> 5
	System.out.println(a|b);	// 0 1 1 1 			-> 7
	System.out.println(a^b);	// 0 0 1 0			-> 2
	
	System.out.println(" ");
	
	int c =17 ;					// 1 0 0 0 1		-> 17
	int d =9;					// 0 1 0 0 1 		-> 9
						 	 // -------------
	System.out.println(c&d);	// 0 0 0 0 1		-> 1 
	System.out.println(c|d);	// 1 1 0 0 1 		-> 25
	System.out.println(c^d);	// 1 1 0 0 0 		-> 24
	
	System.out.println(" ");
	
	int e =91 ;					// 1 0 1 1 0 1 1 	-> 91
	int f =56;					// 0 1 1 1 0 0 0 	-> 56
							//	-----------------
	System.out.println(e&f);	// 0 0 1 1 0 0 0	-> 24
	System.out.println(e|f);	// 1 1 1 1 0 1 1 	-> 123
	System.out.println(e^f);	// 1 1 0 0 0 1 1 	-> 99
	
	}
}
