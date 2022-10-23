//write a program to print first x terms of the series 3N+2 which are not multiple of 4 :
// we will be printing 5 terms here :
 
public class termsSeries {
	public static void main(String args[]) {
		int count = 0; 
		for (int i=1;count<5;i++)
		{
			int num = 3*i+2;
			if (num%4 != 0)
			{
				System.out.println(num);
				count++;
			}
		}
	}
}
