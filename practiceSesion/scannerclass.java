		// just take user input for int, float and double :

package practiceSesion;
 
import java.util.Scanner; 
public class scannerclass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		
		
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);

	}

}
