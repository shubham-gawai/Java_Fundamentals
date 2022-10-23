package MARCH17;
import java.util.Scanner;

abstract class Book{
	
    	String title;
    	abstract void setTitle(String s);
    	String getTitle()
    	
    	{
    		return title;
    	}
}

abstract class MyBook extends Book{
	
	public void setTitle(String s) {
		System.out.println();
		
	}
}

class thuAssig_Q2 {
	public static void main(String args[]) {
		//MyBook b = new MyBook();
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		setTitle("The title is:"+ abc );
	}

	private static void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}

}
