//WAP to print the inverted v star pattern :

taken from google, try it yourself :
package practiceQues;

public class ivertedVstarPattern {
	public static void main(String args[]) {
	 
    {
    	int n=5;
        int i, j;
        for(i = (n - 1); i >= 0; i--)
        {
             
            for(j = (n - 1); j > i; j--)
            {
                System.out.print(" ");
            }
 
             
            System.out.print("*");
 
            // inner gap loop
            for (j = 1; j < (i * 2); j++)
                System.out.print(" ");
 
            if (i >= 1)
                System.out.print("*");
            System.out.println();
        }
    }
	}
}
