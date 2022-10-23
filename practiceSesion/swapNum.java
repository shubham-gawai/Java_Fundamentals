/*		// swap two numbers without using temp variable :
package practiceSesion;

public class swapNum {

	public static void main(String[] args) {
		int a=100;
		int b =24;
		 
		
	 
		a=a+b;		// 100+24 = 124 ;
		b=a-b;		// 124-24 = 100	;		
		a=a-b;		// 124-100 = 24 ;
		
		System.out.println(a);
		System.out.println(b);	
		
	}
}

*/



package practiceSesion;
 

public class swapNum {

	public static void main(String[] args) {
		int a=100;
		int b =24;
		 
		a=a^b;		 // 1 1 0 0 1 0 0
		b=a^b;		 // 0 0 1 1 0 0 0 
		a=a^b;	//   -----------------
					//  1 1 1 1 1 0 0
					//  0 0 1 1 0 0 0
				//	-------------------
				//		1 1 0 0 1 0 0
		
		System.out.println(a);
		System.out.println(b);	
		
	}
}






/*package practiceSesion;

public class swapNum {

	public static void main(String[] args) {
		 int a, b;
		 a=100;
		 b=24;
		int temp;
		
		    temp=a;
		    a=b;
		    b=temp;
		   System.out.println(a);
		   System.out.println(b);
	}

}
*/
