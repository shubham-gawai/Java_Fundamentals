package OOPsPractice;

import java.util.Scanner;

abstract class Book {
	
    String title;
    
    abstract void setTitle(String s);
    
    String getTitle() {
  
        return title;
    }
}


abstract class MyBook extends Book {
	
	 
	 void getTail() {
		// System.out.println("The title is: A tale of two cities");
	 }
  
}


class Thu17Mar_Q3 {
	
	public static void main(String args[]) {
		 
		getTail();
		
	}

	private static void getTail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s   =sc.nextLine();
		
		System.out.println("The title is: "+s);
		
	}
}
